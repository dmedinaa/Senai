package JavaVetoreseMatrizes;
import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Solicita e lê a entrada do usuário
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Calcula a soma dos dígitos usando um loop e imprime o resultado
        int soma = calcularSomaDigitos(numero);
        System.out.println("Soma dos dígitos: " + soma);
    }

    
    public static int calcularSomaDigitos(int numero) {// Função para calcular a soma dos dígitos de um número
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }
}
