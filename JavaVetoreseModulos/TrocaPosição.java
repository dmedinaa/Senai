package JavaVetoreseModulos;

import java.util.Arrays;

public class TrocaPosição {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 1};
        trocarPosicoes(array, 1, 2);
        System.out.println("Array após troca: " + Arrays.toString(array));
    }

    public static void trocarPosicoes(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}


