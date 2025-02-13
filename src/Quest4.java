import java.util.Scanner;

public class Quest4 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INFORME A QUANTIDADE DE NOTAS");
        int qtd= sc.nextInt();
        for(int i=0;i<qtd;i++){
            System.out.println("INFORME A NOTA");
            int n= sc.nextInt();
            int media=n+i/qtd;
            if(media>=7 && media<=10){
                System.out.printf("Aprovado e sua media foi %d\n",media);
            }
            else
                System.out.printf("Reprovado e sua media foi %d\n",media);

        }
    }}