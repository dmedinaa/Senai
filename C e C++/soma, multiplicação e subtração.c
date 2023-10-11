#include <stdio.h>

int main() {

    int numero1, numero2;
    int soma, diferenca, produto;

    printf("Digite o primeiro numero: ");
    scanf("%d", &numero1);

    printf("Digite o segundo numero: ");
    scanf("%d", &numero2);

    soma = numero1 + numero2;
    diferenca = numero1 - numero2;
    produto = numero1 * numero2;

    printf("Soma: %d\n", soma);
    printf("Diferença: %d\n", diferenca);
    printf("Produto: %d\n", produto);

    return 0;
}
