package Lista_Exer_2;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class Ex5_EduardoJM {
    
    public static void main (String []args){
    
        int ano, idade;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite o seu ano de nascimento:");
        ano = s.nextInt();
        
        idade = 2024 - ano;
        
        System.out.println("\nSua idade �: " + idade);
        
        if (idade>=16 && idade<18){
            System.out.println("Voc� j� tem idade para votar!");
        } else if (idade>=18) {
            System.out.println("Voc� tem idade para tirar a habilita��o!");
        } else if (idade<16){
            System.out.println("Voc� n�o tem idade para votar nem fazer habilita��o.");
        }
        
    
    }
    
}
