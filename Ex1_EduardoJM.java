package Lista_Exer_2;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class Ex1_EduardoJM {

    public static void main(String[] args) {
        
        int valor;
        String resultado;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite um m�s (num�rico):");
        valor = s.nextInt();
        
        switch (valor){
            case 1:
                resultado = "Janeiro";
                break;
            case 2:
                resultado = "Fevereiro";
                break;
            case 3:
                resultado = "Mar�o";
                break;
            case 4:
                resultado = "Abril";
                break;
            case 5:
                resultado = "Maio";
                break;
            case 6:
                resultado = "Junho";
                break;
            case 7:
                resultado = "Julho";
                break;
            case 8:
                resultado = "Agosto";
                break;
            case 9:
                resultado = "Setembro";
                break;
            case 10:
                resultado = "Outubro";
                break;
            case 11:
                resultado = "Novembro";
                break;
            case 12:
                resultado = "Dezembro";
                break;
            default:
                resultado = "Valor Inv�lido!";
                break;
        }
        
        System.out.println("\nM�s Inserido: " + resultado);
        System.out.println("M�s Atual: Setembro");
        
        if (valor == 9) {
            System.out.println("O m�s inserido � o ATUAL.");
        } else if (valor < 9){
            System.out.println("O m�s inserido J� PASSOU.");
        } else {
            System.out.println("O m�s inserido se encontra no FUTURO.");
        }
        
    }
    
}
