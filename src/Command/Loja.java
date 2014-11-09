/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Command;

import Singleton.Conexao;
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
       
    }
}
