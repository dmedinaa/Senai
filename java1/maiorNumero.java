package java1;

import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args){

        int maior = 0;
        
        Scanner numero1 = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int a =  numero1.nextInt();

        Scanner numero2 = new Scanner(System.in);
        System.out.print("Digite mais um numero: ");
        int b = numero2.nextInt();

        if(a > b){
            maior = a;
            
            System.out.print("o maior numero é: " + maior);
        } else{ 
            maior = b;
            System.out.print("O maior numero é: " + maior);
        }
    }
    
}
