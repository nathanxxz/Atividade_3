import java.util.Scanner;

public class Quest8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("INFORME UM NUMERO");
        int pares=0;
        int impares=0;
        int num= sc.nextInt();
        for(int i=2;i<=num;i++){
            if(i%2==0){
                System.out.println("------------------------------");
                System.out.printf("Os numeros pares sao %d\n",i);
                System.out.println("------------------------------");
                pares+=1;
                System.out.println("---------------------------------");
                System.out.printf("Quantidade de pares é %d\n",pares);
                System.out.println("---------------------------------");
            }
            else{
                impares+=1;
                System.out.printf("A quantidade de impares sao %d\n",impares);
            }

                }

            }

            }




