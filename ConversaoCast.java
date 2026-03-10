
package conversaocast;


public class ConversaoCast {

    
    public static void main(String[] args) {
      
       double numeroDouble = 10.7;
       int numeroInt = (int) numeroDouble;
       
        System.out.println("Double para Int" + numeroInt);
        
        int valorInt = 9;
        double valorDouble = (double) valorInt;
        
        System.out.println("Int para Double" + valorDouble);
        
        char letra = 'b';
        int valor = (int) letra;
        
        System.out.println("Char para Int" + valor);
             
        
        
    }
    
}
