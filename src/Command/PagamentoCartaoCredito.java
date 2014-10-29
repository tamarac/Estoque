/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Command;

import javax.swing.JOptionPane;

/**
 *
 * @author tamara
 */
public class PagamentoCartaoCredito {
    public void processarCompra(Compra compra) {
        JOptionPane.showMessageDialog(null,"Pago com Cartão!\n" + compra.getInfoNota());
    }
}
