package JavaMatematica2;

public class VolumedeumaPiramide {
    public static void main(String[] args) {
        double volumePiramide = 180; 
        double alturaPiramide = 10; 

        double areaBasePiramide = volumePiramide / alturaPiramide; // formula para acharmos a area da piramide.

        double ladoBasePiramide = Math.sqrt(areaBasePiramide); // formula para acharmos o lado da  piramide.

        System.out.println("Lado da base da pirâmide: " + ladoBasePiramide + " cm");
        System.out.println("Altura da pirâmide: " + alturaPiramide + " cm"); // printamos os resultados.
    }

}
