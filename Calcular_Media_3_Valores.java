
package calcular_media_3_valores;

import java.util.Scanner;

public class Calcular_Media_3_Valores {

   
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double soma;
        double media;
        
        System.out.println("Digite o primeiro numero: ");
        soma = leitor.nextDouble();
        
        System.out.println("Digite o Segundo numero: ");
        soma = soma + leitor.nextDouble();
        
        System.out.println("Digite o terceiro numero: ");
        soma = soma + leitor.nextDouble();
        
        media = soma / 3;
        
        System.out.println("A media é: " + media);
   
    }
}
                
              
                
                
                
                
     
               
        
               
             
             
    }
    
}
