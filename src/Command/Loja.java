/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Command;

import DAO.Conexao;
import interfaces.PagamentoCommand;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Venda;

/**
 *
 * @author tamara
 */
public class Loja {
    Venda v = new Venda();
    protected String nomeDaLoja;
 
    public Loja() {
        nomeDaLoja = "LOJA TESTE";
    }
 
    public void executarCompra(double valor, PagamentoCommand formaDePagamento) {
        Compra compra = new Compra(nomeDaLoja);
        compra.setValor(valor);
        formaDePagamento.processarCompra(compra);
       /* Conexao connection = Conexao.getInstance();
        String sql = "insert into vendas ( data, valtotal) values (?,?,?)";
        try {
            PreparedStatement stm = connection.getConnection().prepareStatement(sql);
            stm.setInt(1,v.cod);
            stm.setInt(2,v.codPV);
            stm.setDate(3,v.dataV);
            stm.setDouble(4,v.valorTotal);
            ResultSet rs = stm.executeQuery();
             while (rs.next()){
                 
               JOptionPane.showMessageDialog(null, "Venda Registrada!");
            }
            
        }catch(SQLException e){
            System.out.println("ERRO:"+ e);
        }
        finally {
            connection.destroy();
        } */
    }
}
