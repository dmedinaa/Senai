package JavaVetoreseMatrizes;
import java.util.Scanner;

public class PerimetroQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o comprimento do lado do quadrado: ");// Solicita e lê a entrada do usuário
        int lado = scanner.nextInt();
        
        
        int perimetro = calcularPerimetroQuadrado(lado);// Calcula o perímetro do quadrado usando a fórmula e imprime o resultado
        System.out.println("Perímetro do quadrado: " + perimetro);
    }

   
    public static int calcularPerimetroQuadrado(int lado) { // Função para calcular o perímetro do quadrado
        return 4 * lado;
    }
}
