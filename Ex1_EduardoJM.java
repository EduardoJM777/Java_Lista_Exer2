package Lista_Exer_2;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex1_EduardoJM {
    
    public static void main (String []args){
    
        double r, volumeEsfera1, volumeEsferaReal;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("CALCULO DO VOLUME DE UMA ESFERA");
        System.out.println("Digite o valor de r:");
        r = s.nextDouble();
        
        volumeEsfera1 = 4 * 3.14 * (Math.pow(r, 3));
        volumeEsferaReal = volumeEsfera1/3;
        
        System.out.printf("O volume da esfera é de: %.2f" , volumeEsferaReal);
        System.out.println("m³");
    }
    
}
