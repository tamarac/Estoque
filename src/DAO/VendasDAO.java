/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author tamara
 */
public class VendasDAO {
    int cod;
    int codP;
    Date dataV;
    int codU;
    
    public void registrarVendas(int cod,int codP,Date dataV, int codU){
         Conexao connection = Conexao.getInstance();
    String sql = "insert into vendas (id, codP, data, codU) values (?,?,?,?)";
    try {
        PreparedStatement stm = connection.getConnection().prepareStatement(sql);
        stm.setInt(1,cod);
        stm.setInt(2,codP);
        stm.setDate(3,dataV);
        stm.setInt(4,codU);
        stm.executeUpdate();
        JOptionPane.showMessageDialog(null, "Venda Registrada!");
        
    }catch(SQLException e){
        System.out.println("ERRO:"+ e);
    }
    finally {
        connection.destroy();
    }
  }   
   
}
