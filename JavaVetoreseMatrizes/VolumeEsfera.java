package JavaVetoreseMatrizes;
import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        double volume = calcularVolumeEsfera(raio);
        System.out.println("Volume da esfera: " + volume);
    }

    public static double calcularVolumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}
