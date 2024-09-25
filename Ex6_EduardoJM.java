package Lista_Exer_2;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex6_EduardoJM {
    
    public static void main (String []args){
    
        double val1, val2;
        char simbolo;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite o primeiro valor: ");
        val1 = s.nextDouble();
        
        System.out.println("Digite o simbolo da operação: ");
        simbolo = s.next().charAt(0);
        
        System.out.println("Digite o segundo valor: ");
        val2 = s.nextDouble();
        
        
        switch (simbolo){
            case '+':
                System.out.println("Expressão: " + val1 + " + " + val2 );
                System.out.println("O resultado é: " + (val1+val2));
                break;
            case '-':
                System.out.println("Expressão: " + val1 + " - " + val2 );
                System.out.println("O resultado é: " + (val1-val2));
                break;
            case '*':
                System.out.println("Expressão: " + val1 + " * " + val2 );
                System.out.println("O resultado é: " + (val1*val2));
                break;
            case '/':
                System.out.println("Expressão: " + val1 + " / " + val2 );
                System.out.println("O resultado é: " + (val1/val2));
                break;
            default:
                System.out.println("Simbolo Inválido!");
                break;
        }
    
    }
    
}
