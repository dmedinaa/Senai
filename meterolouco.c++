#include <iostream>
#include <string>
#include <vector>
#include <random>

using namespace std;

struct Question {
    string questionText;
    vector<string> options;
    int correctOption;
    int points;
};

int fazerPergunta(const Question &pergunta) {
    cout << pergunta.questionText << endl;
    for (size_t i = 0; i < pergunta.options.size(); ++i) {
        cout << i + 1 << ". " << pergunta.options[i] << endl;
    }

    int escolhaUsuario;
    cout << "Digite o número da opção correta: ";
    cin >> escolhaUsuario;

    if (escolhaUsuario == pergunta.correctOption) {
        cout << "Resposta correta! +" << pergunta.points << " pontos." << endl;
        return pergunta.points;
    } else {
        cout << "Resposta incorreta! Nenhum ponto." << endl;
        return 0;
    }
}

int main() {
    vector<string> nomesEquipes = {"Equipe A", "Equipe B", "Equipe C"};
    vector<int> pontuacoesEquipes(nomesEquipes.size(), 0);

    // Prompt user to choose the starting team
    int equipeInicial;
    cout << "Escolha qual equipe vai começar respondendo:" << endl;
    for (size_t i = 0; i < nomesEquipes.size(); ++i) {
        cout << i + 1 << ". " << nomesEquipes[i] << endl;
    }
    cin >> equipeInicial;

    // Input validation
    if (equipeInicial < 1 || equipeInicial > nomesEquipes.size()) {
        cout << "Escolha inválida. Encerrando o programa." << endl;
        return 1;
    }

    equipeInicial--;  // Adjust to 0-based index

    vector<vector<Question>> perguntasEquipes = {
        // Questions for Equipe A
        {
            {"Qual o operador de incremento em C++?", {"++", " +=", "--", " -="}, 1, 1},
             {"Como você declara um vetor em C++", {" variavel[] = valor;", "Vetor {valores}; ", "array valores;", "tipo nome[tamanho]"}, 4, 1},
            {"1. while (true)", "2. for (;;)", "3. do-while (1)", "4. loop()"},
         2, 1},
        },

        // Questions for Equipe B
        {
            {"Como você declara um vetor em C++", {" ...", " ...", " ...", " ..."}, 4, 1},
            {"Qual operador é usado para acessar o endereço de uma variável?", {" ...", " ...", " ...", " ..."}, 2, 1},
            // ... More questions for Equipe B ...
        },

        // Questions for Equipe C
        {
            {"Qual das seguintes opções é usada para declarar uma variável em C++?", {" ...", " ...", " ...", " ..."}, 2, 1},
            {"O que é uma variável em C++?", {" ...", " ...", " ...", " ..."}, 3, 1},
            // ... More questions for Equipe C ...
        }
    };

    for (size_t i = equipeInicial; i < nomesEquipes.size() + equipeInicial; ++i) {
        size_t teamIndex = i % nomesEquipes.size(); // Cycle through the teams

        cout << "Equipe: " << nomesEquipes[teamIndex] << endl;

        for (size_t j = 0; j < perguntasEquipes[teamIndex].size(); ++j) {
            int pontosGanhos = fazerPergunta(perguntasEquipes[teamIndex][j]);
            pontuacoesEquipes[teamIndex] += pontosGanhos;
        }

        cout << "Pontuação total da " << nomesEquipes[teamIndex] << ": " << pontuacoesEquipes[teamIndex] << " pontos." << endl;
        cout << "-------------------------" << endl;
    }

    int pontuacaoMaxima = 0;
    int indiceVencedor = -1;
    for (size_t i = 0; i < pontuacoesEquipes.size(); ++i) {
        if (pontuacoesEquipes[i] > pontuacaoMaxima) {
            pontuacaoMaxima = pontuacoesEquipes[i];
            indiceVencedor = i;
        }
    }

    cout << "A equipe vitoriosa é: " << nomesEquipes[indiceVencedor] << " com " << pontuacaoMaxima << " pontos!" << endl;

    return 0;
}