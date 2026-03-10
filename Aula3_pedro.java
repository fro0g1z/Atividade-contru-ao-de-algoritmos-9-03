
package aula3_pedro;

import java.util.Scanner;
        

public class Aula3_pedro {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Aplicacao que soma tres numeros");
        System.out.println("Inserir o primeiro numero");
        double numero1 = leitor.nextDouble ();
        System.out.println("Insira o segundo numero");
        double numero2 = leitor.nextDouble();
        System.out.println("Insira o terceiro numero");
        double numero3 = leitor.nextDouble();
        double soma = numero1 + numero2 + numero3;
        System.out.println("Resultado: =" + soma);
    }
    
}
