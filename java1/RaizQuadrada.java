package java1;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int a = num.nextInt();

        num.close();
        
        System.out.println("A raiz quadrada do número é:  " + Math.sqrt(a));

    }
    
}
