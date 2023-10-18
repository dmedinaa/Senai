package JavaVetoreseMatrizes;
import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Solicita e lê a entrada do usuário
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Verifica se o número é perfeito e imprime o resultado
        if (verificarNumeroPerfeito(numero)) {
            System.out.println("O número é perfeito.");
        } else {
            System.out.println("O número não é perfeito.");
        }
    }

    // Função para verificar se o número é perfeito
    public static boolean verificarNumeroPerfeito(int numero) {
        int somaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == numero;
    }
}
