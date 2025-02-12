import java.util.Scanner;

public class Quest4 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INFORME A QUANTIDADE DE NOTAS");
        double soma=0;
        double nums= sc.nextDouble();
        for(int i=1;i<=nums;i++){
            System.out.println("INFORME A NOTA");
            double nota= sc.nextDouble();
            nota+=soma;
            double media=soma/nums;
            if (media>=7 && media<=10){
                System.out.println("Aprovado");

            }
            else{
                System.out.println("Reprovado");

        }
    }}}
