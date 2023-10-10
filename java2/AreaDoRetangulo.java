package java2;

import java.util.Scanner;

public class AreaDoRetangulo {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Digite a base do retangulo: ");
        int base = num.nextInt();
        num.close();

        Scanner num1 = new Scanner(System.in);
        System.out.print("Digite a altura do retangulo: ");
        int altura = num1.nextInt();
        num1.close();

        double area = base * altura;

        System.out.println("A area do retangulo é: " + area);
        
    }
    
}
