#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cctype>

char gerarLetraAleatoria() {
    return '0' + rand() % 26;
}

int main() {
    srand(time(0)); // Usando time(0) em vez de nullptr
    
    char letraSorteada = gerarLetraAleatoria();
    char letraChute;
    int tentativas = 0;
    const int maxTentativas = 5;
    
    std::cout << "Bem-vindo ao Jogo da Super Forca!" << std::endl;
    
    while (tentativas < maxTentativas) {
        std::cout << "Tentativa " << (tentativas + 1) << "/" << maxTentativas << ": ";
        std::cin >> letraChute;
        letraChute = std::toupper(letraChute); // Convertendo para maiúscula
        
        if (letraChute == letraSorteada) {
            std::cout << "Parabéns! Você acertou a letra." << std::endl;
            break;
        } else {
            std::cout << "Letra incorreta. Tente novamente." << std::endl;
        }
        
        tentativas++;
    }
    
    if (tentativas == maxTentativas) {
        std::cout << "Você atingiu o limite de tentativas. A letra sorteada era: " << letraSorteada << std::endl;
    }
    
    std::cout << "Fim do jogo." << std::endl;
    std::cout << "Letra sorteada: " << letraSorteada << std::endl;
    std::cout << "Tentativas utilizadas: " << tentativas << std::endl;
    
    return 0;
}
