package java2.ExerciciosNivelFacil;

import java.util.Scanner;

public class ImparePar {
    public static void main(String[] args){
    int par = 0;

        Scanner num = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int a = num.nextInt();

    num.close();

    if(a % 2 <= par){
       
        System.out.println("O número é par ");
    } else {
      
        System.out.println("O número é ímpar ");

    }
 }
}
