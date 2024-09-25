package Lista_Exer_2;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class Ex4_EduardoJM {
    
    public static void main (String []args){
        
        double altura, peso, imcHomem, imcMulher;
        String sexo;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite uma altura:");
        altura = s.nextDouble();
        
        System.out.println("Digite um peso:");
        peso = s.nextDouble();
        
        System.out.println("Digite o sexo (masculino/feminino):");
        sexo = s.next();
        
        imcHomem = (((72.7) * (altura)) - 58);
        imcMulher = (((62.1) * (altura)) - 44.7);
        
        if ("masculino".equals(sexo)){
            System.out.println("\nO seu peso ideal �: " + imcHomem);
        }
        
        if ("feminino".equals(sexo)){
            System.out.println("\nO seu peso ideal �: " + imcMulher);
        }
        
        
        if (("masculino".equals(sexo)) && (imcHomem == peso)){
            System.out.println("Voc� est� no seu peso ideal.");
        } else if (("masculino".equals(sexo)) && (imcHomem < peso)){
            System.out.println("Voc� est� acima do seu peso ideal.");
        } else if (("masculino".equals(sexo)) && (imcHomem > peso)){
            System.out.println("Voc� est� abaixo do seu peso ideal.");
        }
        
        if (("feminino".equals(sexo)) && (imcMulher == peso)){
            System.out.println("Voc� est� no seu peso ideal.");
        } else if (("feminino".equals(sexo)) && (imcMulher < peso)){
            System.out.println("Voc� est� acima do seu peso ideal.");
        } else if (("feminino".equals(sexo)) && (imcMulher > peso)){
            System.out.println("Voc� est� abaixo do seu peso ideal.");
        }
        
    }
    
}
