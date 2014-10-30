/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iterator;

import iterator.IteradorListaDeProdutos;
import interfaces.AgregadoDeProdutos;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author tamara
 */
public class ProdutosCompra implements AgregadoDeProdutos {
    public static ArrayList<Produto> lista = new ArrayList<>();
   
    
    @Override
     public IteradorListaDeProdutos criarIterator() {
        return new IteradorListaDeProdutos(lista) {};
    }
}