
package algoritmo_para_calcular_a_area_de_um_círculo;

import java.util.Scanner;

public class Algoritmo_Para_Calcular_a_Area_De_Um_Círculo {

   
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double raio = 0;
        double area;
        double pi = 3.14;
        
        System.out.println("vamos calcular a area de um circulo!");
        System.out.println("Qual o raio do circulo?");
         raio = raio + leitor.nextDouble();
        
        System.out.println("Considere pi como: 3.14");
        
        area = pi * raio * raio;
        
        System.out.println(" a area do circulo com raio " + raio + " é: " + area);
                    
    }
    
}
