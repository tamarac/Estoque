/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author tamara
 */
public class ProdutoDAO {
    
    public void cadastrarProduto(String nome, int qnt, int qntM, float preco, Date validade){
         Conexao connection = Conexao.getInstance();
    String sql = "insert into produto (nome, qtd, qdtM, preco, validade) values (?,?,?,?,?)";
    try {
        PreparedStatement stm = connection.getConnection().prepareStatement(sql);
        stm.setString(1,nome);
        //stm.setInt(6, codFor);
        stm.setInt(2, qnt);
        stm.setInt(3, qntM);
        stm.setFloat(4, preco);
        stm.setDate(5, validade);
        stm.executeUpdate();
        JOptionPane.showMessageDialog(null, "Produto cadastrado!");
        System.out.println("Dados Inseridos!");
    }catch(SQLException e){
        System.out.println("ERRO:"+ e);
    }
    finally {
        connection.destroy();
    }
  } 
    
   public Produto buscaProduto(Integer cod){
         Conexao connection = Conexao.getInstance();
         String sql = "SELECT * FROM produto WHERE id =?";
         Produto p = new Produto();
        try {
            PreparedStatement stm = connection.getConnection().prepareStatement(sql);
            stm.setInt(1, cod);
            ResultSet rs = stm.executeQuery();
            
            
            while (rs.next()){
                p.codP = rs.getInt("id");
                p.nomeP = rs.getString("nome");
                p.preco = rs.getFloat("preco");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return p;
    }
    
    
}
