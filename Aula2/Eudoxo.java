import java.util.Scanner;
public class Eudoxo{
    public static void main(String []Args){
        double raiz = 0, iteracao = 0, c = 0, x = 0, erroab = 0, real = 0;
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.printf("Qual a raiz você quer calcular ? :");
        Scanner s = new Scanner(System.in);
        c = s.nextDouble();
        real = Math.sqrt(c);
        x = (1 + c)/2;
        erroab = real - x;
        System.out.printf("n "+iteracao +" = "+ x +" "+Math.abs(erroab)+ "\n");
        while ( Math.abs(erroab) > 0.00001){
            x = ((c/x)+x)/2;
            iteracao = iteracao + 1;
            erroab = real - x;
            System.out.printf("n %.1f = %.2f %.5f\n", iteracao, x, Math.abs(erroab));
        }
        System.out.printf("By SoenShem")
    }
}