/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Singleton.Conexao;
import Sessao.Sessao;
import gereestoque.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author tamara
 */
public class UsuarioDAO {  

    public boolean autenticacao(String user, String pass) {
    Conexao connection = Conexao.getInstance();
    String sql = "Select * from usuario where user = ? and password = ?";
    Usuario usu = new Usuario();
    try {
        PreparedStatement stm = connection.getConnection().prepareStatement(sql);
        stm.setString(1,user);
        stm.setString(2, pass);
        ResultSet rs = stm.executeQuery();
       
        if(rs.next()){
            usu.codUsuario = rs.getInt("id");
            usu.nomeUsuario = rs.getString("nome");
            usu.user = rs.getString("user");
            usu.password = rs.getString("password");
            usu.role = rs.getString("role");
            Sessao.user = usu;
            return true;
        }
        
    }catch(SQLException e){
        System.out.println("ERRO:"+ e);
    }finally {
        connection.destroy(); 
    }
    return false;
}
    public void cadastrarUsuario(String nome,String user,String senha,String role){
         Conexao connection = Conexao.getInstance();
    String sql = "insert into usuario (nome, user, password, role) values (?,?,?,?)";
    try {
        PreparedStatement stm = connection.getConnection().prepareStatement(sql);
        stm.setString(1,nome);
        stm.setString(2,user);
        stm.setString(3,senha);
        stm.setString(4,role);
        stm.executeUpdate();
        JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");
        
    }catch(SQLException e){
        System.out.println("ERRO:"+ e);
    }
    finally {
        connection.destroy();
    }
  }  

public Usuario buscaUsuario(Integer cod){
         Conexao connection = Conexao.getInstance();
         String sql = "SELECT * FROM usuario WHERE id =?";
         Usuario usu = new Usuario();
        try {
            PreparedStatement stm = connection.getConnection().prepareStatement(sql);
            stm.setInt(1, cod);
            ResultSet rs = stm.executeQuery();
            
            
            while (rs.next()){
                usu.codUsuario = rs.getInt("id");
                usu.nomeUsuario = rs.getString("nome");
                usu.user = rs.getString("user");
                usu.password = rs.getString("password");
                usu.role = rs.getString("role");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usu;
    }
}
