package JavaVetoreseModulos;

import java.util.Scanner;

    public class contadorVogais1 {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Digite uma frase:");
String frase = scanner.nextLine();
int numVogais = contaVogais(frase);
System.out.println( "O numero de vogais é:" + numVogais);
scanner.close();
}

public static int contaVogais(String frase){
int numVogais = 0;

for (int i = 0; i<frase.length(); i++){
char letras = frase.charAt(i);
if (letras == 'a' || letras == 'A' || letras == 'e' || letras == 'E' || letras == 'I' || letras == 'i' || letras == 'I' ||
letras == 'O' || letras == 'o' || letras == 'U' || letras == 'u' ){
numVogais ++;
}
}
return numVogais;
}
    
}
