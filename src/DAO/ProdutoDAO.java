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
import java.util.ArrayList;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Fornecedor;
import model.Produto;

/**
 *
 * @author tamara
 */
public class ProdutoDAO {

    
    public void cadastrarProduto(Produto p){
         Conexao connection = Conexao.getInstance();
    String sql = "insert into produto (nome, qtd, qdtM, preco, validade,cod_for) values (?,?,?,?,?,?)";
    try {
        PreparedStatement stm = connection.getConnection().prepareStatement(sql);
        stm.setString(1,p.nomeP);
        stm.setInt(2,p.qnt);
        stm.setInt(3,p.qntM);
        stm.setFloat(4,p.preco);
        stm.setString(5,p.validade);
        stm.setInt(6,p.codFor);
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
                p.qnt = rs.getInt("qtd");
                p.qntM = rs.getInt("qdtM");
                p.validade = rs.getString("validade");
                p.codFor = rs.getInt("cod_for");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return p;
    }
   public void descontaProduto(int id){
       Produto p = new Produto();
       Conexao connection = Conexao.getInstance();
            String sql = "UPDATE produto SET qtd = qtd - 1 WHERE id = ? ";
        try {
            PreparedStatement stm = connection.getConnection().prepareStatement(sql);
            stm.setInt(1,id);        
            stm.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("ERRO:"+ e);
        }
        finally {
            connection.destroy();
        } 
   }
public ArrayList<Produto> geraPedido(){
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        
        Conexao connection = Conexao.getInstance();
             String sql = "SELECT id,nome, qtd, qdtM FROM produto WHERE qtd <= qdtM";
         try {
             PreparedStatement stm = connection.getConnection().prepareStatement(sql);        
             stm.executeQuery();
             ResultSet rs = stm.executeQuery();
            
            
            while (rs.next()){
                Produto p = new Produto();
                p.codP = rs.getInt("id");
                p.nomeP = rs.getString("nome");
                p.qnt = rs.getInt("qtd");
                p.qntM = rs.getInt("qdtM");
                
                produtos.add(p);
            }
         }catch(SQLException e){
             System.out.println("ERRO:"+ e);
         }
         finally {
             connection.destroy();
         }
         return produtos;
    }
}
