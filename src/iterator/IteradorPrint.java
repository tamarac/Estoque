/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iterator;

import iterator.IteradorInterno;
import interfaces.IteradorInterface;
import model.Produto;

/**
 *
 * @author tamara
 */
public class IteradorPrint extends IteradorInterno {
 
    public IteradorPrint(IteradorInterface it) {
        this.it = it;
    }
 
    @Override
    protected void operacao(Produto p) {
        System.out.println(p.codP);
    }
 
}
