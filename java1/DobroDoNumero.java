package java1;

import java.util.Scanner;

public class DobroDoNumero {
    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = numero.nextInt();

        numero.close();

        int dobro = a * 2;

        System.out.println("O dobro do número é: " + dobro);
    }
    
}
