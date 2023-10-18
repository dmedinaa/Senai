import java.util.Arrays;

public class atividade6 {
    public static void main(String[] args) {

    int[ ] original = { 1 , 2 , 3 , 2 , 1 , 4 , 5 , 3 };

    // remover repetidos
    int[ ] unicos = new int[ original.length ];
    int qtd = 0;
    for( int i = 0 ; i < original.length ; i++ ) {
        boolean existe = false;
        for( int j = 0 ; j < qtd ; j++ ) {
            if( unicos[ j ] == original[ i ] ) {
                existe = true;
                break;
                }
            }
        if( !existe ) {
        unicos[ qtd++ ] = original[ i ];
            }
        }

    // ajuste do tamanho do vetor resultante
    unicos = Arrays.copyOf( unicos , qtd );

    // imprime resultado
    for( int i = 0 ; i < unicos.length ; i++ ) {
        System.out.println( "" + i + " = " + unicos[ i ] );
        }

    }
}

