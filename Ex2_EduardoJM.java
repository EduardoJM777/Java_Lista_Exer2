package Lista_Exer_2;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex2_EduardoJM {
    
    public static void main (String []args){
    
        int idFuncionario;
        double hrTrabalhada, rsPorHr, salario, hrExtra, rsExtra;
        String mes;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite o n�mero da matr�cula do funcionario:");
        idFuncionario = s.nextInt();
        
        System.out.println("Digite o n�mero de horas trabalhadas:");
        hrTrabalhada = s.nextDouble();
        
        System.out.println("Digite o valor recebido por hora trabalhada:");
        rsPorHr = s.nextDouble();
        
        System.out.println("Digite o m�s das informa��es(Ex: Maio/24):");
        mes = s.next();
        
        salario = hrTrabalhada*rsPorHr;
        
        if (hrTrabalhada>200){
            hrExtra = hrTrabalhada-200;
            rsExtra= hrExtra*rsPorHr*1.50;
            salario=salario+rsExtra;
        }
        
        System.out.println("\nMatr�cula do Funcion�rio: " + idFuncionario);
        System.out.println("Horas Trabalhadas: " + hrTrabalhada);
        System.out.println("M�s das Informa��es: " + mes);
        System.out.println("Sal�rio Total: R$" + salario);
    
    }
    
}
