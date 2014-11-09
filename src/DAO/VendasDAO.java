/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Singleton.Conexao;
import Sessao.Sessao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Venda;
/**
 *
 * @author tamara
 */
public class VendasDAO {
    
    public Venda registrarVendas(Venda v){
        int cod = Sessao.user.codUsuario;
         Conexao connection = Conexao.getInstance();
    String sql = "insert into vendas (dataV,valorVenda, codU) values (?,?,?)";
    try {
        PreparedStatement stm = connection.getConnection().prepareStatement(sql);
        stm.setDate(1,v.dataV);
        stm.setDouble(2,v.valorTotal);
        stm.setInt(3, cod);
        stm.executeUpdate();
        
    }catch(SQLException e){
        System.out.println("ERRO:"+ e);
    }
    finally {
        connection.destroy();
    }
        return v;
  }   
   
}
