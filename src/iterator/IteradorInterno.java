/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iterator;

import interfaces.IteradorInterface;
import model.Produto;

/**
 *
 * @author tamara
 */
public abstract class IteradorInterno {
 
    IteradorInterface it;
 
    public void percorrerLista() {
        for (it.first(); !it.isDone(); it.next()) {
            operacao(it.currentItem());
        }
    }
 
    protected abstract void operacao(Produto p);
}
