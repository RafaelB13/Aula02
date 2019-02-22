
package aula01.estruturadedados;

import java.util.ArrayList;


public class Pilha <T>{
    
    private int topo;
    private final T[] pilha;
    
    
    //Construtor
    public Pilha() {
        this.topo = -1;
        this.pilha = (T[]) new Object[10];
    }
    
    //metodo
    public boolean inserir(T elemento){
        if(!estaCheia()){
            topo++;
            pilha[topo] = elemento;
            return true;
        }else
            return false;
    }
    //metodo
    public boolean estaCheia(){
        return topo == pilha.length-1;
    }
    
    public T remover(){
        if(!estaVazia()){
           T temp = pilha[topo];
           topo--;
           return temp;
        }
        
        return null;
        
    }
    
    
    
    public boolean estaVazia(){
        return topo ==-1;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
