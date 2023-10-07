package java1;

import java.util.Scanner;

public class MenorDivisor {
    public static void main(String[] args){
        Scanner Num = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = Num.nextInt();
        Num.close();

        int menordivisor = 1;

        System.out.println("O menor divisor do número é: " + menordivisor);
    }
    
}
