import java.util.Scanner;

public class Quest6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME UM NUMERO");
        int num= sc.nextInt();
        for(int i=2;i<num;i++)
            if(num%i==0){
                System.out.println("Nao é primo");
                break;
            }
             else
                System.out.println("é primo");
            }}




