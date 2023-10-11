package JavaMatematica1;

public class Piramide {
    public static void main(String[] args) {
        double ladoBase = 6;
        double altura = 8;

        double volume = (1.0 / 3) * Math.pow(ladoBase, 2) * altura; // Colocamos a formula e usamos o Math.pow calcular a potência.
        System.out.println("O volume da pirâmide é: " + volume); // imprimimos o resultado.
    }

}
