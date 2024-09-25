package Lista_Exer_2;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class Ex3_EduardoJM {
    
    public static void main (String []args){
    
        int val1, val2, val3;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite o primeiro valor:");
        val1 = s.nextInt();
        
        System.out.println("Digite o segundo valor:");
        val2 = s.nextInt();
        
        System.out.println("Digite o terceiro valor:");
        val3 = s.nextInt();
        
        if (val1<val2 && val1<val3){
            System.out.println("\nVALORES EM ORDEM CRESCENTE: ");
            System.out.println(val1);
            if (val2<val3){
                System.out.println(val2);
                System.out.println(val3);
            }
            else {
                System.out.println(val3);
                System.out.println(val2);
            }
        }
        
        if (val2<val1 && val2<val3){
            System.out.println("\nVALORES EM ORDEM CRESCENTE: ");
            System.out.println(val2);
            if (val1<val3){
                System.out.println(val1);
                System.out.println(val3);
            }
            else {
                System.out.println(val3);
                System.out.println(val1);
            }
        }
        
        if (val3<val2 && val3<val1){
            System.out.println("\nVALORES EM ORDEM CRESCENTE: ");
            System.out.println(val3);
            if (val1<val2){
                System.out.println(val1);
                System.out.println(val2);
            }
            else {
                System.out.println(val2);
                System.out.println(val1);
            }
        }
    }
    
}
