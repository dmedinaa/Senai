package JavaVetoreseModulos;
    import java.util.Arrays;

public class OrdenarNumeros {
    public static void main(String[] args) {
        int[] lista = {5, 2, 8, 1, 9, 3};
        ordenar(lista);
        System.out.println("Lista ordenada: " + Arrays.toString(lista));
    }

    public static void ordenar(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }
}

