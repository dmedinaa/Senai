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
    vector<Question> perguntasFaceis = {
        {"Qual o operador de incremento em C++? ", {"++", " += ", " --", " -="}, 1, 1},
         {"O que é o operador ternário em C++?",
     {"1. Um operador usado para realizar operações ternárias",
      "2. Um operador que trabalha apenas com números inteiros",
      "3. Um operador que substitui o if-else em certas situações",
      "4. Um operador utilizado para comparar três valores"},
     3, 1},
    {"O que é a sobrecarga de funções em C++?",
     {"1. Um recurso que permite usar a mesma função para diferentes tipos de dados",
      "2. Um recurso que permite uma função retornar múltiplos valores",
      "3. Um recurso que torna as funções mais complexas",
      "4. Um recurso que permite que funções sejam chamadas a partir de várias classes"},
     1, 1},
    {"Qual a diferença entre uma classe e um objeto em C++?",
     {"1. Classes são usadas para declarar variáveis, enquanto objetos definem métodos",
      "2. Classes são tipos de dados, enquanto objetos são instâncias desses tipos",
      "3. Classes são usadas apenas em programação orientada a objetos, enquanto objetos são usados em programação procedural",
      "4. Classes são construídas a partir de objetos preexistentes"},
     2, 1},
   
    };

    vector<Question> perguntasFaceisGrupoB = {
        {"Como você declara um vetor em C++", {" variavel[] = valor;", "Vetor {valores}; ", "array valores;", "tipo nome[tamanho]"}, 4, 1},
        {"Qual operador é usado para acessar o endereço de uma variável?", {" *", " &", " /", " %"}, 2, 1},
        {"Qual das seguintes declarações é usada para imprimir no console?",
         {"1. print()", "2. console.log()", "3. cout <<", "4. printf()"},
         3, 1},
         {"Qual é a sintaxe correta para comentários em C++?",
         {"1. // Este é um comentário", "2. /* Este é um comentário */", "3. # Este é um comentário", "4. <!-- Este é um comentário -->"},
         1, 1},
    };

    vector<Question> perguntasFaceisGrupoC = {
       {"Qual das seguintes opções é usada para declarar uma variável em C++?",
         {"1. variable x;", "2. int x;", "3. x = 5;", "4. declare x;"},
         2, 1},
       {"O que é uma variável em C++?",
         {"1. Uma função que retorna um valor", "2. Um tipo de dado numérico", "3. Um contêiner de armazenamento", "4. Um operador matemático"},
         3, 1},
         {"Qual das seguintes opções é usada para criar um loop infinito em C++?",
         {"1. while (true)", "2. for (;;)", "3. do-while (1)", "4. loop()"},
         2, 1},
         {"Qual é o tipo de dado usado para armazenar caracteres individuais? ", {" int", " double", " char", " string"}, 3, 1},
    };

    vector<string> nomesEquipes = {"Equipe A", "Equipe B", "Equipe C"};
    vector<int> pontuacoesEquipes(nomesEquipes.size(), 0);

    for (size_t i = 0; i < nomesEquipes.size(); ++i) {
        cout << "Equipe: " << nomesEquipes[i] << endl;

        vector<Question> perguntasEquipe;
        if (i == 1) {
            perguntasEquipe = perguntasFaceisGrupoB;
        } else if (i == 2) {
            perguntasEquipe = perguntasFaceisGrupoC;
        } else {
            perguntasEquipe = perguntasFaceis;
        }

        for (size_t j = 0; j < perguntasEquipe.size(); ++j) {
            int pontosGanhos = fazerPergunta(perguntasEquipe[j]);
            pontuacoesEquipes[i] += pontosGanhos;
        }

        cout << "Pontuação total da " << nomesEquipes[i] << ": " << pontuacoesEquipes[i] << " pontos." << endl;
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
