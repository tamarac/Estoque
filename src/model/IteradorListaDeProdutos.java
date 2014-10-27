/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author tamara
 */
public abstract class IteradorListaDeProdutos implements IteradorInterface {
    Produto[] lista;
    int contador;

       IteradorListaDeProdutos(ArrayList<Produto> lista) {
        //codigo aqui
    }
    public void first() {
        contador = 0;
    }
 
    public void next() {
        contador++;
    }  
}
