package java1;

import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args){

        int maior = 0;
        
        Scanner numero1 = new Scanner(System.in);  //// criamos o scanner para receber os dados do usuario.
        System.out.print("Digite um número: ");
        int a =  numero1.nextInt();  // adicionamos o valor atribuido no scanner na variavel.
        System.out.print("Digite mais um número: ");
        int b = numero1.nextInt();

        numero1.close(); // fechamos os scanners para evitar vazamentos de recursos.

        if(a > b){
            maior = a;
            
            System.out.print("o maior número é: " + maior);
        } else{ 
            maior = b;
            System.out.print("O maior número é: " + maior);
        }
    }
    
}
