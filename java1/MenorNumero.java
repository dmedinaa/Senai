package java1;

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args){
        int menor = 0;

        Scanner primeironum = new Scanner(System.in); // criamos o scanner para receber os dados do usuario.
        System.out.print("Digite um número: ");
        int a = primeironum.nextInt(); // adicionamos o valor atribuido no scanner na variavel.

        Scanner segundonum = new Scanner(System.in);
        System.out.print("Digite mais um número: "); // repetimos o processo 
        int b = segundonum.nextInt();

        primeironum.close();
        segundonum.close();

        if(a > b){
            menor = b;
            System.out.println("O menor número é: " + menor);
        } else{
            menor = a;
        System.out.println("O menor número é: " + menor);
        }
    }
    
}
