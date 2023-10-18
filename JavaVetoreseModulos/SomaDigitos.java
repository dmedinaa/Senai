package JavaVetoreseModulos;
 import java.util.Scanner;

public class SomaDigitos {
   

public class SomaDigito {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = num.nextInt();
        int soma = somaDigitos(numero);
        System.out.println("Soma dos dígitos: " + soma);
        num.close();
    }

    public static int somaDigitos(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }
}

    
}
