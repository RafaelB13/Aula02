
package aula01.estruturadedados;

/**
 *
 * @author 312182006
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pilha<Integer> p = new Pilha<Integer>();
        
        Integer str=null;
        
        for (Integer i = 0; i < 10; i++) {
            
            p.inserir(i);
        }
        
        
        
        do{
            str = p.remover();
            System.out.println(str);
            
        }while (str != null);
        
        
        
    }
    
    
    
    
}
