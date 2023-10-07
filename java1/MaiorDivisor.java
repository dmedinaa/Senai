package java1;

import java.util.Scanner;

public class MaiorDivisor {
    public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int a = num.nextInt();
    num.close();

    int maiordivisor = a;

    System.out.println("O maior divisor do número é: " + maiordivisor);

    }
}
