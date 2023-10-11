package JavaMatematica2;

public class VolumedeumCone {
    public static void main(String[] args) {
        double volumeCone = 94; // cm³
        double alturaCone = 9; // cm
        double raioCone = Math.sqrt(3 * volumeCone / (Math.PI * alturaCone)); //colocamos a formula.
        System.out.println("Raio do cone: " + raioCone + " cm");
        System.out.println("Altura do cone: " + alturaCone + " cm"); //printamos o resultado
     }

}
