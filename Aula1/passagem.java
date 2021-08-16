import java.util.Scanner;
public class passagem{
    public static void main(String []Args){
        double preco = 0, valor = 0;
        String regiao = " ";
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.printf("Bem vindo a Passagens-Estados\n Atualmente temos as opções: Ida e volta, ou somente Ida pespectivamente\n Para: \n    Nordeste     | 740R$ | 400R$\n    Norte        | 655R$ | 345R$\n    Centro-Oeste | 807R$ | 448R$\n Digite o nome do local para onde deseja ir: ");
        Scanner s = new Scanner(System.in);
        regiao = s.next();
        //System.out.println(regiao);
        if (regiao.equalsIgnoreCase("Nordeste")){
            System.out.printf("Temos os planos:\n    1 - Ida e volta\n    2 - Somente ida\n Escolha um plano de viagem: ");
            preco = s.nextDouble();
            if (preco == 1){
                preco = 740;
                System.out.printf("Quantas passagens ?\n");
                valor = s.nextDouble();
                preco = preco*valor;
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.printf("Vai custar " + preco + "R$\n");
            }else if (preco == 2){
                preco = 400;
                System.out.printf("Quantas passagens ?\n");
                valor = s.nextDouble();
                preco = preco*valor;
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.printf("Vai custar " + preco + "R$\n");
            }else{
                System.out.printf("Escolha um plano.\n");
            }
        }else if (regiao.equalsIgnoreCase("Norte")){
            System.out.printf("Temos os planos:\n    1 - Ida e volta\n    2 - Somente ida\n Escolha um plano de viagem: ");
            preco = s.nextDouble();
            if (preco == 1){
                preco = 655;
                System.out.printf("Quantas passagens ?\n");
                valor = s.nextDouble();
                preco = preco*valor;
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.printf("Vai custar " + preco + "R$\n");
            }else if (preco == 2){
                preco = 345;
                System.out.printf("Quantas passagens ?\n");
                valor = s.nextDouble();
                preco = preco*valor;
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.printf("Vai custar " + preco + "R$\n");
            }else{
                System.out.printf("Escolha um plano.\n");
            }
        }else if (regiao.equalsIgnoreCase("Centro") | regiao.equalsIgnoreCase("Centro-oeste")){
            System.out.printf("Temos os planos:\n    1 - Ida e volta\n    2 - Somente ida\n Escolha um plano de viagem: ");
            preco = s.nextDouble();
            if (preco == 1){
                preco = 807;
                System.out.printf("Quantas passagens ?\n");
                valor = s.nextDouble();
                preco = preco*valor;
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.printf("Vai custar " + preco + "R$\n");
            }else if (preco == 2){
                preco = 448;
                System.out.printf("Quantas passagens ?\n");
                valor = s.nextDouble();
                preco = preco*valor;
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.printf("Vai custar " + preco + "R$\n");
            }else{
                System.out.printf("Escolha um plano.\n");
            }
        }else{
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 
            System.out.printf("Não encontrei o destino.\n\n");
            main(Args);
        }
    }
}