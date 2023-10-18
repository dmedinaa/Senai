import java.util.Scanner;
public class Atividade1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero = ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo numero =  ");
        double b = scanner.nextDouble();
        scanner.close();

        double resultado = a*b;

        System.out.println(a + "*" + b + " = " + resultado);
    }
}

