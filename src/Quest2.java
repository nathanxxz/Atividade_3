import java.util.Scanner;

public class Quest2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME QUAL NUMERO DA TABUADA DESEJA VER:");
        int num= sc.nextInt();
        for(int i=1;i<=10;i++){
            int mut=i*num;
            System.out.println(num + "x" + i + "=" + mut);

        }
    }
}
