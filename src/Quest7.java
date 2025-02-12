import java.util.Scanner;

public class Quest7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("INFORME UM NUMERO");
        int num= sc.nextInt();
        for(int i=1;i<num;i++){
            num*=i;
            System.out.println(num);
        }

    }
}
