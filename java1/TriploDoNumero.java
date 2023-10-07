package java1;

import java.util.Scanner;

public class TriploDoNumero {
    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int a = num.nextInt();
        num.close();

        int triplo = a * 3;

        System.out.println(triplo);
    }
    
}
