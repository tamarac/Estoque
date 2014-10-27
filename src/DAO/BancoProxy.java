/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import gereestoque.Principal;

/**
 *
 * @author tamara
 */
public class BancoProxy extends UsuarioDAO {
    
    protected String user,password,role;
    
    public BancoProxy(String user, String password){
        
        this.user = user;
        this.password = password;
        this.role = role;
    } 
    private boolean adminPermissao(){
        
        if (super.autenticacao(this.user, this.password)){
                
            return true;
            
        }
        return false;
    }
    public boolean permissao(){
        return adminPermissao();
    }
   
}
    
