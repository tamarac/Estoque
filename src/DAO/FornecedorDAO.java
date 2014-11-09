/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Singleton.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Fornecedor;
import model.Produto;

/**
 *
 * @author tamara
 */
public class FornecedorDAO {
   
       
     public void cadastrarFornecedor(String nome,String cnpj, String tel, String endereco,String email){
         Conexao connection = Conexao.getInstance();
    String sql = "insert into fornecedor (nome, cnpj, tel, email, endereco) values (?,?,?,?,?)";
    try {
        PreparedStatement stm = connection.getConnection().prepareStatement(sql);
        stm.setString(1,nome);
        stm.setString(2,cnpj);
        stm.setString(3,tel);
        stm.setString(4,email);
        stm.setString(5,endereco);
        stm.executeUpdate();
        JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado!");
        
    }catch(SQLException e){
        System.out.println("ERRO:"+ e);
    }
    finally {
        connection.destroy();
    }
  }
     public Fornecedor buscaFornecedor(Integer cod){
         Conexao connection = Conexao.getInstance();
         String sql = "SELECT * FROM fornecedor WHERE id =?";
         Fornecedor f = new Fornecedor();
        try {
            PreparedStatement stm = connection.getConnection().prepareStatement(sql);
            stm.setInt(1, cod);
            ResultSet rs = stm.executeQuery();
            
            
            while (rs.next()){
                f.nome = rs.getString("nome");
                f.cnpj = rs.getString("cnpj");
                f.tel  = rs.getString("tel");
                f.email = rs.getString("email");
                f.endereco = rs.getString("endereco");
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return f;
    }
    
     
      
}
