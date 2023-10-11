package JavaMatematica1;

public class Cubo {
    public static void main(String[] args) {
        double aresta = 7;
        double volume = Math.pow(aresta, 3);
        double areaSuperficie = 6 * Math.pow(aresta, 2);
        System.out.println("O volume do cubo é: " + volume);
        System.out.println("A área da superfície do cubo é: " + areaSuperficie);
    }

}
