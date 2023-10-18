public class Atividade7 {
    public static void main(String[] args) {
        // Método limpa tela
public static void limpaTela() { 
    // Instruções
	for(int aux=1;aux<=25;aux++)
	System.out.println();
}

//Método Contar vogais
public static int[] contaVogal(String frase){
	//Declarações
	int totalConsoantes = 0, totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;
	int dados[] = new int[6];
	//Instruções
	for (int aux=0;aux<frase.length();aux++){
		if(frase.charAt(aux)=='a' || frase.charAt(aux)=='A'){
			totalA+=1;
			dados[0] = totalA;
		}
		else if(frase.charAt(aux)=='e' || frase.charAt(aux)=='E'){
			totalE+=1;
			dados[1] = totalE;
		}
		else if(frase.charAt(aux)=='i' || frase.charAt(aux)=='I'){
			totalI+=1;
			dados[2] = totalI;
		}
		else if(frase.charAt(aux)=='o' || frase.charAt(aux)=='P'){
			totalO+=1;
			dados[3] = totalO;
		}
		else if(frase.charAt(aux)=='u' || frase.charAt(aux)=='U'){
			totalU+=1;
			dados[4] = totalU;
		}
		else{
			totalConsoantes+=1;
			dados[5] = totalConsoantes;
			
		}
	}
	
	
	return dados;
}

//Método Somar Vogais
public static int somaVogal(int dados[]){
	//Declarações
	int totalVogal;
	
	//Instruções
	totalVogal = dados[0] + dados[1] + dados[2] + dados[3] + dados[4];
	return totalVogal;
	
}

public static void main(String[] args) {
	//Declarações
	//String vogais = "aeiou";
	//String consoantes = "bcdfghjklmnpqrstuvwyxz";
	int dados[] = new int[7];
	Scanner ler = new Scanner(System.in);
	String frase;
	
	//Instruções
	System.out.print("Digita uma String: ");
	frase = ler.nextLine();
	
	dados = contaVogal(frase);
	
	dados[6] = somaVogal(dados);
	
	for(int i:dados)
		System.out.println(dados[i]);
	

}
    }
    
}
