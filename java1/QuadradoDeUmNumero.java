package java1;

import java.util.Scanner;

public class QuadradoDeUmNumero{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = num.nextInt();

        num.close();

        int quadrado = a * a;

        System.out.println("O quadrado do número é: " + quadrado);
    }
}