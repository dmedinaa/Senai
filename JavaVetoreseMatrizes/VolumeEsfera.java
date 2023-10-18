package JavaVetoreseMatrizes;
import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Solicita e lê a entrada do usuário
       
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        
      
        double volume = calcularVolumeEsfera(raio);  // Calcula o volume da esfera usando a fórmula e imprime o resultado
        System.out.println("Volume da esfera: " + volume);
    }

    
    public static double calcularVolumeEsfera(double raio) {// Função para calcular o volume da esfera
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}
