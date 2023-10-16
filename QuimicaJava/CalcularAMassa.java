package QuimicaJava;

import java.util.Scanner;

public class CalcularAMassa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mols: ");
        double mols = scanner.nextDouble();
        System.out.print("Massa molar: ");
        double massaMolar = scanner.nextDouble();

        double massa = mols * massaMolar;
        System.out.println("A massa é " + massa);


    }
    
}
