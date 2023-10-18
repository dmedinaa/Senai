package JavaVetoreseMatrizes;
import java.util.Scanner;

public class Divisibilidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if (verificarDivisibilidade(numero)) {
            System.out.println("O número é divisível por 4 e 7.");
        } else {
            System.out.println("O número não é divisível por 4 e 7.");
        }
    }

    public static boolean verificarDivisibilidade(int numero) {
        return numero % 4 == 0 && numero % 7 == 0;
    }
}
