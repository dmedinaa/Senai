package JavaVetoreseMatrizes;
import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Solicita e lê as entradas do usuário
       
        System.out.print("Digite a base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();
        System.out.print("Digite a base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();
        System.out.print("Digite a altura do trapézio: ");
        double altura = scanner.nextDouble();
        
        
        double area = calcularAreaTrapezio(baseMaior, baseMenor, altura);// Calcula a área do trapézio usando a fórmula e imprime o resultado
        System.out.println("Área do trapézio: " + area);
    }

   
    public static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) { // Função para calcular a área do trapézio
        return (baseMaior + baseMenor) * altura / 2;
    }
}
