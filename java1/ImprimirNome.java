package java1;

import java.util.Scanner;

public class ImprimirNome {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Criando um scanner para receber os dados do usuario.

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.println(name);
    }
    
}
