import java.util.Scanner;

public class Quest3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME NOTAS");
        int soma=0;
        int num= sc.nextInt();
        while (num>0){
            System.out.print("INFORME NOTAS");
            num= sc.nextInt();
            soma+=num;
            System.out.printf("Quantidade de notas é %d\n",soma);
        }

}}
