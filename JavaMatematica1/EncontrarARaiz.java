package JavaMatematica1;

public class EncontrarARaiz {
    public static void main(String[] args) {
     
        double a = 3;
        double b = -7;
        double c = 2;

        double delta = b * b - 4 * a * c; //adicionamos a formula de delta.

        if (delta > 0) { //if/else para caso a raiz seja real ou não
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: x = " + x);
        } else {
            System.out.println("A equação não possui raízes reais.");
 }
 }
}

