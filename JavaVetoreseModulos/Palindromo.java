package JavaVetoreseModulos;
    import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = num.nextLine().toLowerCase();
        if (ehPalindromo(palavra)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
        num.close();
    }

    public static boolean ehPalindromo(String palavra) {
        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        return palavra.equals(invertida);
    }
}
