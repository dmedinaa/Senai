package JavaMatematica1;

public class EncontrarRaiz2 {
    public static void main(String[] args) {
        // Coeficientes da equação quadrática.
        double a = 2;
        double b = 5;
        double c = -3;

        double delta = b * b - 4 * a * c;

        // Calculando as raízes usando a fórmula de Bhaskara.
        if (delta > 0) {
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
