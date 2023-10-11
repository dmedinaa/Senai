package JavaMatematica2;

public class VolumedeumCubo {
    public static void main(String[] args) {
        double volumeCubo = 512; // cm³
        double arestaCubo = Math.cbrt(volumeCubo);
        System.out.println("Comprimento da aresta do cubo: " + arestaCubo + " cm");
    }

}
