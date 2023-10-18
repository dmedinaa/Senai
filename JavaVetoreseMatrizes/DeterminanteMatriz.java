package JavaVetoreseMatrizes;

public class DeterminanteMatriz {
    public static void main(String[] args) {
        
        int[][] matriz = {{2, 3}, {4, 1}};
      
        int determinante = calcularDeterminante(matriz);
        System.out.println("Determinante: " + determinante);  // Calcula usando a fórmula para matrizes 2x2 e imprime o resultado
    }

    
    public static int calcularDeterminante(int[][] matriz) {// Função para calcular o determinante de uma matriz 2x2
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    }
}
