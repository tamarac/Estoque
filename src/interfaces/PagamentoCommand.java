/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import Command.Compra;

/**
 *
 * @author tamara
 */
public interface PagamentoCommand {
     void processarCompra(Compra compra);
}
