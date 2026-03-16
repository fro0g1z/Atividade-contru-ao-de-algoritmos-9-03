
package area_do_triangulo;

import java.util.Scanner;

public class Area_do_triangulo {

  
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double base = 0;
        double altura = 0;
        
        
        System.out.println("Digite a área do triangulo com base X " );
        base = base + leitor.nextDouble();
        
        System.out.println(" Digite a área do triangulo com base Y : ");
        altura = altura + leitor.nextDouble();
        
        double area = (base * altura) / 2;
        
        System.out.println("A área do triangulo com base X é" + base + "e altura" + altura + "e :" + area);
                
    
    }
    
}
