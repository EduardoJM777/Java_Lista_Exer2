package Lista_Exer_2;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class Ex3_EduardoJM {
    
    public static void main (String []args){
    
        double valorCompra, desconto, prazo1Parc, prazo5Parc, prazo10Parc,
               acres10Parc;
        int codPagamento;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite o valor total da compra:");
        valorCompra = s.nextDouble();
        
        System.out.println("Digite o código da condição do pagamento:");
        System.out.println("1 - A vista com 10% de desconto.");
        System.out.println("2 - A prazo, 1 parcela com 8% de desconto.");
        System.out.println("3 - A prazo, 5 parcelas sem desconto ou acréscimos.");
        System.out.println("4 - A prazo, 10 parcelas com acréscimo de 5% no valor total.");
        codPagamento = s.nextInt();
        
        desconto = (valorCompra - (valorCompra * 0.1));
        prazo1Parc = (valorCompra - (valorCompra * 0.08));
        prazo5Parc = (valorCompra/5);
        acres10Parc = (valorCompra + (valorCompra * 0.05));
        prazo10Parc = (acres10Parc/10);
        
        
        if (codPagamento == 1){
            System.out.println("Valor a ser pago: " + desconto);
            System.out.println("Parcelas: 1");
            System.out.println("Valor por parcelas: " + desconto);
        } else if (codPagamento == 2){
            System.out.println("Valor a ser pago: " + prazo1Parc);
            System.out.println("Parcelas: 1");
            System.out.println("Valor por parcelas: " + prazo1Parc);
        } else if (codPagamento == 3){
            System.out.println("Valor a ser pago: " + valorCompra);
            System.out.println("Parcelas: 5");
            System.out.println("Valor por parcelas: " + prazo5Parc);
        } else if (codPagamento == 4){
            System.out.println("Valor a ser pago: " + acres10Parc);
            System.out.println("Parcelas: 10");
            System.out.println("Valor por parcelas: " + prazo10Parc);
        }
        
    }
    
}
