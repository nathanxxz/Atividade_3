import java.util.Objects;
import java.util.Scanner;

public class Quest9 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String usu;
        String senha;
        int tentativas = 0;
        while (tentativas<3){
            System.out.println("INFORME SEU NOME DE USUARIO");
            usu= sc.next();
            System.out.println("INFORME SUA SENHA DE LOGIN");
            senha= sc.next();
            if(Objects.equals(senha, "ola")){
                System.out.printf("Login efetuado com sucesso,seja bem-vindo %s",usu);
                break;
            }
            else{
                tentativas++;
                System.out.println("Login Negado, tente novamente");
                }
        }
    }}