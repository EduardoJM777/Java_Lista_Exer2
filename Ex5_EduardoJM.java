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
        
        System.out.println("\nSua idade é: " + idade);
        
        if (idade>=16 && idade<18){
            System.out.println("Você já tem idade para votar!");
        } else if (idade>=18) {
            System.out.println("Você tem idade para tirar a habilitação!");
        } else if (idade<16){
            System.out.println("Você não tem idade para votar nem fazer habilitação.");
        }
        
    
    }
    
}
