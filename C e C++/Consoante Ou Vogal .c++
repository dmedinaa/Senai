#include <iostream>
#include <string>
#include <cstring>

int main() {
    while (true) {
        char vogais[] = "aeiou"; // Renomeado para vogais (plural)
        char consoantes[] = "bcdfghjklmnpqrstvwxyz"; // Renomeado para consoantes (plural)

        std::string letraProcurada;
        std::cout << "Digite a letra que deseja procurar: ";
        std::cin >> letraProcurada;

        if (letraProcurada.length() != 1) {
            std::cout << "Insira somente uma letra válida." << std::endl;
            continue; // Volta ao início do loop para nova entrada
        }

        char letra = tolower(letraProcurada[0]); // Convertendo para minúscula

        bool ehVogal = false; // Renomeado para ehVogal
        for (int i = 0; i < strlen(vogais); i++) { // Renomeado para vogais
            if (vogais[i] == letra) {
                ehVogal = true; // Renomeado para ehVogal
                break;
            }
        }

        bool ehConsoante = false; // Renomeado para ehConsoante
        for (int i = 0; i < strlen(consoantes); i++) { // Renomeado para consoantes
            if (consoantes[i] == letra) {
                ehConsoante = true; // Renomeado para ehConsoante
                break;
            }
        }

        if (ehVogal) { // Renomeado para ehVogal
            std::cout << "A letra é uma vogal." << std::endl;
            break; // Sai do loop se uma vogal for encontrada
        } else if (ehConsoante) { // Renomeado para ehConsoante
            std::cout << "A letra é uma consoante." << std::endl;
            break; // Sai do loop se uma consoante for encontrada
        } else {
            std::cout << "Não é uma vogal nem consoante. Insira um caractere válido." << std::endl;
        }
    }

    return 0;
}
