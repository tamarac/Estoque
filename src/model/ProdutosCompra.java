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
public class ProdutosCompra implements AgregadoDeProdutos {
    Produto p;
    static ArrayList<Produto> lista = new ArrayList<>();
    public ProdutosCompra(Produto p){
        lista.add(p);
    }
     public IteradorListaDeProdutos criarIterator() {
        return new IteradorListaDeProdutos(lista);
    }
}
