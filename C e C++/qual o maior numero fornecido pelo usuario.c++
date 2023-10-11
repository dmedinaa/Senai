#include <iostream>

int main() {
  int numero1;
  std::cout << "Digite um número: ";
  std::cin >> numero1;
  
  int numero2;
  std::cout << "Digite um número: ";
  std::cin >> numero2;
  
  int numero3;
  std::cout << "Digite um número: ";
  std::cin >> numero3;

  int maior = numero1;

  if (numero2 > maior) {
    maior = numero2;
  }

  if (numero3 > maior) {
    maior = numero3;
  }

  std::cout << "O maior número é: " << maior << std::endl;

  return 0;
}
