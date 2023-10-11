package JavaMatematica2;

public class VolumedeumaPiramide {
    public static void main(String[] args) {
        double volumePiramide = 180; // cm³
        double alturaPiramide = 10; // cm
        double areaBasePiramide = volumePiramide / alturaPiramide;
        double ladoBasePiramide = Math.sqrt(areaBasePiramide);
        System.out.println("Lado da base da pirâmide: " + ladoBasePiramide + " cm");
        System.out.println("Altura da pirâmide: " + alturaPiramide + " cm");
    }

}
