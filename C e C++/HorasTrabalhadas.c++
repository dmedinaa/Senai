#include <iostream>
#include <iomanip>
#include <limits> // Para usar std::numeric_limits

using namespace std;

// Função para receber uma entrada válida de número do usuário
double receberEntradaNumerica() {
    double numero;
    while (true) {
        cin >> numero;
        if (cin.fail()) {
            cin.clear(); // Limpa o estado de erro
            cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Descarta a entrada inválida
            cout << "Entrada invalida. Por favor, digite um numero: ";
        } else {
            cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Limpa o buffer de entrada
            return numero;
        }
    }
}

// Função para calcular horas trabalhadas em um dia
double calcularHorasDiarias() {
    cout << "Digite o numero de horas trabalhadas em um dia: ";
    return receberEntradaNumerica();
}

// Função para calcular horas trabalhadas em uma semana
double calcularHorasSemanais() {
    double horasDiarias = calcularHorasDiarias();
    double horasSemanais = horasDiarias * 7;
    return horasSemanais;
}

// Função para calcular horas trabalhadas em um mês (considerando 4 semanas em um mês)
double calcularHorasMensais() {
    double horasSemanais = calcularHorasSemanais();
    double horasMensais = horasSemanais * 4;
    return horasMensais;
}

// Função para calcular horas trabalhadas em um ano (considerando 12 meses em um ano)
double calcularHorasAnuais() {
    double horasMensais = calcularHorasMensais();
    double horasAnuais = horasMensais * 12;
    return horasAnuais;
}

// Função para calcular horas extras trabalhadas
double calcularHorasExtras() {
    double horasDiarias = calcularHorasDiarias();
    double horasNormaisSemanais = horasDiarias * 5; // Considerando 5 dias de trabalho por semana
    cout << "Digite o numero de horas trabalhadas na semana: ";
    double horasTrabalhadasSemanais = receberEntradaNumerica();
    double horasExtras = horasTrabalhadasSemanais - horasNormaisSemanais;
    return horasExtras;
}

int main() {
    double horasDiarias = calcularHorasDiarias();
    double horasSemanais = calcularHorasSemanais();
    double horasMensais = calcularHorasMensais();
    double horasAnuais = calcularHorasAnuais();
    double horasExtras = calcularHorasExtras();

    cout << fixed << setprecision(2);
    cout << "Horas trabalhadas em um dia: " << horasDiarias << endl;
    cout << "Horas trabalhadas em uma semana: " << horasSemanais << endl;
    cout << "Horas trabalhadas em um mes: " << horasMensais << endl;
    cout << "Horas trabalhadas em um ano: " << horasAnuais << endl;
    cout << "Horas extras trabalhadas: " << horasExtras << endl;

    return 0;
}
