package JavaVetoreseModulos;

    public class RemocaoRepetidosLista{
public static void main(String[] args){
int [] vetor = {1,2,3,2,1,4,5,3,7,9,8,9};
int novoTamanho = removeRepetidos(vetor);
System.out.println("Vetor sem repetição:");
for(int i = 0; i < novoTamanho; i++){
System.out.print(vetor[i] + " ");
}

}
public static int removeRepetidos(int[] vetor){
int novoTamanho = 0;
for (int i = 0; i < vetor.length; i++){
boolean repetido = false;
for(int j = 0; j < novoTamanho; j++){

if(vetor[i]==vetor[j]){
repetido=true;
break;
}
}
if(!repetido){
vetor[novoTamanho]= vetor[i];
novoTamanho++;
}
}
return novoTamanho;
}
}
    
