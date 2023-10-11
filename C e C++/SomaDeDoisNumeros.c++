#include<iostream>  // erro ortografico e a ausencia da #

int main(){
   int n1, n2, soma;
   std::cout << "Digite dois numeros: "; // // adicionamos "std::" antes do "cout" e "cin"
   std::cin >> n1 >> n2;
   soma = n1 + n2;
   std::cout << "A soma dos numeros eh " << soma << std::endl; // "adicionamos std::endl"
   return 0;
}
