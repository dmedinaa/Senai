package java2;

public class Helloworld {
    public static void main(String[] args){
        int idade = 16;
        String nome = "Danilo Medina";
        double preço = 50.5;

        System.out.println("Olá mundo");
        System.out.println(idade);
        System.out.println(nome);
        System.out.println(preço);
        System.out.println("Olá mundo, meu nome é " + nome + ", é eu tenho " + idade + " anos de idade. Ontem eu comprei uma pizza de " + preço + " reais ");

        for ( int i = 1; i <= 10; i++) {
           System.out.println(i);
       }   

}
}

