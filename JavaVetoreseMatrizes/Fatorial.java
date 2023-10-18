package JavaVetoreseMatrizes;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Solicita e lê a entrada do usuário
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Calcula o fatorial usando um loop e imprime o resultado
        int fatorial = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + ": " + fatorial);
    }

    // Função para calcular o fatorial de um número
    public static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
