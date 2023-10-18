package JavaVetoreseModulos;

    public class SomaDePares {
        public static void main(String[] args) {
            int[] array = {2, 3, 6, 8, 10, 11};
            int soma = somaPares(array);
            System.out.println("Soma dos números pares: " + soma);
        }
    
        public static int somaPares(int[] array) {
            int soma = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    soma += num;
                }
            }
            return soma;
        }
    }
    