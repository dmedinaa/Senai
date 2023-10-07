package java1;

import java.util.Scanner;

public class OperaçõesComDoisNumeros{
    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int b = num2.nextInt();

        num1.close();
        num2.close();

        int soma = a + b;
        int diferença = a - b;
        int produto = a * b;
        int quociente = a / b;

        System.out.println("Soma: " + soma);
        System.out.println("Diferença: " + diferença);
        System.out.println("Produto: " + produto);
        System.out.println("Quociente: " + quociente);
    }
}