package QuimicaJava;

import java.util.Scanner;

public class ConversaoEmMol {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massa: ");
        double massa = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Massa Molar: ");
        double massaMolar = scanner1.nextDouble();
        scanner.close();
        scanner1.close();

        double mols = massa / massaMolar;
        System.out.println("A quantidade de mol é " + mols + ".");
    }
}
