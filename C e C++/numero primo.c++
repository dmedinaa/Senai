#include <iostream>

bool isPrime(int number) {
    if (number <= 1) {
        return false;
    }
    for (int i = 2; i * i <= number; i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    int number;
    std::cout << "Digite um número inteiro positivo: ";
    std::cin >> number;

    if (isPrime(number)) {
        std::cout << number << " é um número primo." << std::endl;
    } else {
        std::cout << number << " não é um número primo." << std::endl;
    }

    return 0;
}
