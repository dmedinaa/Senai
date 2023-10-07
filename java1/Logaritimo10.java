package java1;

import java.util.Scanner;

public class Logaritimo10 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = num.nextInt();
        num.close();

        System.out.println("O logaritimo de base 10 do número é: " + Math.log10(a));    
    }
    
}
