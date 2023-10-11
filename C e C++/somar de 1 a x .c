#include <stdio.h>

int main() {
   int n = 10;
   int soma = 1;
    for(int i = 1; i <= n; i++){
        soma += i;
   }

   printf("A soma dos números de 1 a %d é: %d\n", n, soma);
   return 0;
}
