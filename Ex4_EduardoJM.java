package Lista_Exer_2;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex4_EduardoJM {
    
    public static void main (String []args){
    
        int qtdPessoas;
        String tamanhoPizza;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de pessoas:");
        qtdPessoas = s.nextInt();
        
        System.out.println("Digite o tamanho da pizza(s):");
        System.out.println("broto - pequena - media - grande");
        tamanhoPizza = s.next();
        
        switch (tamanhoPizza){
            case "broto":
                System.out.println("A quantidade de pizzas necessária é: " + qtdPessoas);
                break;
            case "pequena":
                System.out.println("A quantidade de pizzas necessária é: " + (qtdPessoas/2));
                    if (qtdPessoas % 2 == 1){
                        System.out.println("+ 1 broto");
                    }
                break;
            case "media":
                System.out.println("A quantidade de pizzas necessária é: " + (qtdPessoas/3));
                    if (qtdPessoas % 3 == 1){
                        System.out.println("+ 1 broto");
                    } else if (qtdPessoas % 3 == 2){
                        System.out.println("+ 1 pequena");
                    }
                break;
            case "grande":
                System.out.println("A quantidade de pizzas necessária é: " + (qtdPessoas/4));
                    if (qtdPessoas % 4 == 1){
                        System.out.println("+ 1 broto");
                    } else if ( qtdPessoas % 4 == 2){
                        System.out.println(" + 1 pequena");
                    } else if (qtdPessoas % 4 == 3){
                        System.out.println(" + 1 media");
                    }
                break;
                
        }
        
    }
    
}
