package Lista_Exer_2;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex8_EduardoJM {
    
    public static void main (String []args){
    
        int idade;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite a idade do nadador: ");
        idade = s.nextInt();
        
        switch (idade){
            case 1, 2, 3, 4:
                System.out.println("Não há categoria.");
                break;
            case 5, 6, 7:
                System.out.println("Categoria: Infantil A");
                break;
            case 8, 9, 10:
                System.out.println("Categoria: Infantil B");
                break;
            case 11, 12, 13:
                System.out.println("Categoria: Juvenil A");
                break;
            case 14, 15, 16, 17:
                System.out.println("Categoria: Juvenil B");
                break;
            default:
                System.out.println("Categoria: Adulto");
                break;
        }
    
    }
    
}
