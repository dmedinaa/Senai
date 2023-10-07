package java1;

import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args){

        int maior = 0;
        
        Scanner numero1 = new Scanner(System.in);  //// criamos o scanner para receber os dados do usuario.
        System.out.print("Digite um número: ");
        int a =  numero1.nextInt();  // adicionamos o valor atribuido no scanner na variavel.

        Scanner numero2 = new Scanner(System.in);
        System.out.print("Digite mais um número: ");
        int b = numero2.nextInt();

        numero1.close(); // fechamos os scanners para evitar vazamentos de recursos.
        numero2.close();

        if(a > b){
            maior = a;
            
            System.out.print("o maior número é: " + maior);
        } else{ 
            maior = b;
            System.out.print("O maior número é: " + maior);
        }
    }
    
}
