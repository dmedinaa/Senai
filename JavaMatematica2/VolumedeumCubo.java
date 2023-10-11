package JavaMatematica2;

public class VolumedeumCubo {
    public static void main(String[] args) {
        double volumeCubo = 512; // cm³
        double arestaCubo = Math.cbrt(volumeCubo); // colocamos a biblioteca Math.cbrt para multiplicamos ao cubo ( x3).
        System.out.println("Comprimento da aresta do cubo: " + arestaCubo + " cm"); //printamos os resultados
        
    }

}
