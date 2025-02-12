import java.time.LocalDateTime;
import java.util.Scanner;

public class Quest5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int menu=-1;
        while (menu!=0){
            System.out.println("----------------------");
            System.out.println("Saudacoes (1) ");
            System.out.println("Data e hora atual (2) ");
            System.out.println("Sair (0) ");
            System.out.println("----------------------");
            System.out.println("Informe a opcao");
            menu= sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Seja bem vindo");
                    break;
                case 2:
                    LocalDateTime localDateTime=LocalDateTime.now();
                    System.out.println(localDateTime);
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opcao invalida");

            }
        }
    }
}
