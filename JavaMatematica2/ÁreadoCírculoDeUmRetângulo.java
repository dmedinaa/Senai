package JavaMatematica2;

public class ÁreadoCírculoDeUmRetângulo {
    public static void main(String[] args) {
        double comprimentoRetangulo = 20; // cm
        double larguraRetangulo = 10; // cm
        double perimetroCirculo = 2 * Math.PI * Math.sqrt((comprimentoRetangulo * larguraRetangulo) / Math.PI);
        double raioCirculo = perimetroCirculo / (2 * Math.PI);
        double areaCirculo = Math.PI * raioCirculo * raioCirculo;
        System.out.println("Raio do círculo: " + raioCirculo + " cm");
        System.out.println("Área do círculo: " + areaCirculo + " cm²");
    }

}
