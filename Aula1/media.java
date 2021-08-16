import java.util.Scanner;
public class media{

     public static void main(String []args){
        double nota1 = 0, nota2 = 0, media = 0, notafinal = 0;
        System.out.printf("Digite as notas\n");
        Scanner s = new Scanner(System.in);
        nota1 = s.nextDouble();
        nota2 = s.nextDouble();
        
        media = (nota1+nota2)/2;
        notafinal = (10 - media);

        if(media >= 7){
            System.out.println("Aprovado por media");
        }else if(media >= 4 && media < 7){
            System.out.println("Precisa fazer prova final");
            System.out.println("Precisa tirar: " + notafinal);
        }else if(media < 4){
            System.out.println("Reprovado");
        }
        
        // System.out.printf("A média é: %f \n",media);
        System.out.println("A média é: " + media);
        
     }
}