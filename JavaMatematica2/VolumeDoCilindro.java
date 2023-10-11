package JavaMatematica2;

public class VolumeDoCilindro {
    public static void main(String[] args) {
        double volumeCilindro = 785; 
        double alturaCilindro = 13; 

        double raioCilindro = Math.sqrt(volumeCilindro / (Math.PI * alturaCilindro)); // adicionamos a formula.
        System.out.println("Raio do cilindro: " + raioCilindro + " cm");
        System.out.println("Altura do cilindro: " + alturaCilindro + " cm"); //printamos os resultados.
    }

}
