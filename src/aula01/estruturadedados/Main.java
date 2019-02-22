/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01.estruturadedados;

/**
 *
 * @author 312182006
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pilha<String> p = new Pilha<String>();
        
        p.inserir("Rafael");
        p.inserir("Unifacs");
        p.inserir("Teste");
        
        String str = null;
        
        
        
        do{
            str = p.remover();
            System.out.println(str);
            
        }while (str != null);
        
        
        
        
    }
    
    
    
    
}
