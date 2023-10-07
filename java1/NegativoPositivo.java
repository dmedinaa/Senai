package java1;

import java.util.Scanner;

public class NegativoPositivo {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = num.nextInt();

        num.close();

        if (a < 0 ){
            System.out.println("O número é negativo ");
        } else {
            System.out.println("O número é positivo ");
        }
    }
    
}
