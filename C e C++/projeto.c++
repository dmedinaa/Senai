#include <iostream>
#include <string>

int main() {
    std::string nome1; 

    nome1 = "Brahma:";
    std::string nome2 = "/indentificacao do produto BA:751. ";
    std::string nomeCompleto = nome1 + " " + nome2;
    std::cout << "Produto: " << nomeCompleto << std::endl;
   {
    int a ;
    std::cout << "Digite a quantidade do prduto: ";
    std::cin >> a ;
    int b = 3.50;

    int valor =  a * b;
    std::cout << "Valor a ser pago: " << valor << std::endl;
    }
    
    return 0;
}
