package JavaMatematica2;

public class VolumeDoCilindro {
    public static void main(String[] args) {
        double volumeCilindro = 785; // cm³
        double alturaCilindro = 13; // cm
        double raioCilindro = Math.sqrt(volumeCilindro / (Math.PI * alturaCilindro));
        System.out.println("Raio do cilindro: " + raioCilindro + " cm");
        System.out.println("Altura do cilindro: " + alturaCilindro + " cm");
    }

}
