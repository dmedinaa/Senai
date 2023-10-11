#include <iostream>

int main() {
    const int SIZE = 5;
    const char vetor[SIZE][3] = {"CN", "SE", "US", "DE", "CA"};

    char siglaBusca[3];
    std::cout << "Digite a sigla que deseja verificar:" << std::endl;
    std::cin >> siglaBusca;

    bool encontrada = false;
    for (int i = 0; i < SIZE; i++) {
        if (vetor[i][0] == siglaBusca[0] && vetor[i][1] == siglaBusca[1]) {
            encontrada = true;
            break;
        }
    }

    if (encontrada) {
        std::cout << "A sigla " << siglaBusca << " foi encontrada no vetor." << std::endl;
    } else {
        std::cout << "A sigla " << siglaBusca << " não foi encontrada no vetor." << std::endl;
    }

    return 0;
}
