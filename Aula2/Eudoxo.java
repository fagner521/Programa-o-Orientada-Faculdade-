import java.util.Scanner;
public class Eudoxo{
    public static void main(String []Args){
        double raiz = 0, iteracao = 0, c = 0, x = 0;
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.print("Qual a raiz você quer calcular ? :");
        Scanner s = new Scanner(System.in);
        c = s.nextDouble();
        x = (1 + c)/2;
        System.out.print("n "+iteracao +" = "+ x + "\n");
        while (iteracao < 9){
            x = ((c/x)+x)/2;
            iteracao = iteracao + 1;
            System.out.print("n "+iteracao +" = "+ x + "\n");
        }
    }
}