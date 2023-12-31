package JavaMatematica1;

import java.util.Scanner;


public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// criamos uma sequencia de scanner para salvar os dados fornecidos pelo usuário.

        System.out.println("Digite os coeficientes da equação quadrática:"); 
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c; //colocamos a formula de delta.

        if (delta > 0) { // if/esle para as contições de ser uma raiz real ou não.
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: x = " + x);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }

        scanner.close(); // fechamos o scanner para evitando exceções de esgotamento de recursos e outros problemas.
    }
}
