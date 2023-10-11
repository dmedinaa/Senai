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

  float media;

    media = (numero1 + numero2 + numero3)  / 3.0;

    std::cout << "A média dos números é: " << media << std::endl;

    return 0;

}
