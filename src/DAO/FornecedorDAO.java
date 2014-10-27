/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author tamara
 */
public class FornecedorDAO {
    String nome;
    String cnpj;
    String tel;
    String email;
    String endereco;
       
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
     public void ConsultaFornecedor() throws SQLException{
         Conexao connection = Conexao.getInstance();
           String sql = "SELECT * FROM fornecedor ";
           PreparedStatement stm = connection.getConnection().prepareStatement(sql);
           
     }
      public void ConsultaFornecedor(String dsc) throws SQLException{
           Conexao connection = Conexao.getInstance();
           String sql = "SELECT * FROM fornecedor WHERE nome LIKE '% (?)' OR email LIKE '% (?)' Order by id ";
           PreparedStatement stm = connection.getConnection().prepareStatement(sql);
           stm.setString(1,dsc);
           stm.setString(2,dsc);
     }
     
      
}
