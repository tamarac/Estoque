/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Command;

import interfaces.PagamentoCommand;
import javax.swing.JOptionPane;
/**
 *
 * @author tamara
 */
public class PagamentoBoleto implements PagamentoCommand {
 
    @Override
    public void processarCompra(Compra compra) {
        JOptionPane.showMessageDialog(null,"Boleto criado!\n" + compra.getInfoNota());
    }
 
}
