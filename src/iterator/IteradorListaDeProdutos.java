/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iterator;

import interfaces.IteradorInterface;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author tamara
 */
public abstract class IteradorListaDeProdutos implements IteradorInterface {
    protected ArrayList<Produto> lista;
    protected int contador;
 
    protected IteradorListaDeProdutos(ArrayList<Produto> lista) {
        this.lista = lista;
        contador = 0;
    }
 
    public void first() {
        contador = 0;
    }
 
    public void next() {
        contador++;
    }
 
    public boolean isDone() {
        return contador == lista.size();
    }
 
    public Produto currentItem() {
        if (isDone()) {
            contador = lista.size() - 1;
        } else if (contador < 0) {
            contador = 0;
        }
        return lista.get(contador);
    }
}
