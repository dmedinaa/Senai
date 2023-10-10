
package java2.ExerciciosNivelFacil;

import java.util.Scanner;

public class Soma2 {
    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int a = num.nextInt();
        num.close();

        Scanner num2 = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int b = num2.nextInt();
        num2.close();

        int soma = a + b;
        System.out.println(soma);
    }
    
}
