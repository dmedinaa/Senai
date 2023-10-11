package JavaMatematica2;

public class VolumeDoCilindro {
    public static void main(String[] args) {
        double volumeCilindro = 785; // adicionamos o volume do cilindro em cm²
        double alturaCilindro = 13; // adicionamos a altura do Cilindro em cm²

        double raioCilindro = Math.sqrt(volumeCilindro / (Math.PI * alturaCilindro)); // 
        System.out.println("Raio do cilindro: " + raioCilindro + " cm");
        System.out.println("Altura do cilindro: " + alturaCilindro + " cm");
    }

}
