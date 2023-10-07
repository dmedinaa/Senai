package java1;

import java.util.Scanner;

public class FatorialDoNumero {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        
        int numero, resultadoDoFatorial = 1;
        int cont = 1;

        do{
            System.out.println("Digite um número: ");
            numero = num.nextInt();
            num.close();
        
        for(int i = 1; i <= numero; i++ ){
            resultadoDoFatorial = resultadoDoFatorial * i;
        }

        System.out.println("!" + numero + "=" + resultadoDoFatorial);
        cont++;

        } while(cont < 2);

    }
}
