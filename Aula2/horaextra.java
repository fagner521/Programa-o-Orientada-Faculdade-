import java.util.Scanner;
public class horaextra{
    public static void main(String []Args){
        double salario = 0, horastrabalhadas = 0, horapreco = 0, horaextras = 0, bonus = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.printf("Qual é o seu salario ?: ");
        salario = s.nextDouble();
        System.out.printf("Quantas horas trabalhadas esse mes ?: ");
        horastrabalhadas = s.nextDouble();
        horapreco = salario/40;
        if (horastrabalhadas > 40){
            horaextras = horastrabalhadas - 40;
            bonus = salario + (horapreco*1.5)*horaextras;
            System.out.printf("O Salario total essse mes será: "+bonus);
        }else {
            System.out.printf("Sem hora Extra!");
        }
        //System.out.printf("By SoenShem");
    }
}
    