/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import gereestoque.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    try {
        PreparedStatement stm = connection.getConnection().prepareStatement(sql);
        stm.setString(1,user);
        stm.setString(2, pass);
        ResultSet rs = stm.executeQuery();

        if(rs.next()){
            Principal tela = new Principal();
                tela.setVisible(true);
            return true;
             
            
        }
        return false;
        
        
    }catch(SQLException e){
        System.out.println("ERRO:"+ e);
    }finally {
        connection.destroy(); 
    }
    return true;
}
    public void cadastrarUsuario(String nome,String user,String senha,String role){
         Conexao connection = Conexao.getInstance();
    String sql = "insert into usuarios (nome, user, password, role) values (?,?,?,?)";
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


}
