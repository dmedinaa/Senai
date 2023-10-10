package java1;

public class SequenciaDeFibonacci {
    public static void main(String[] args) {
        //Declarei os valores que eu quero
        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        for (int i = 3; i < 11; i++){ 
            n3 = n1 + n2; //numero 3 é a soma do numero 1 + numero 2
            System.out.print(n3 + " "); //vai seguir para o proximo numero
            n1 = n2;
            n2 = n3;
        }
    }
}
