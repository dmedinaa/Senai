#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    const int TAMANHO = 5;
    string planetas[TAMANHO];

    cout << "Digite os nomes de 5 planetas do nosso sistema solar:" << endl;
    for (int i = 0; i < TAMANHO; i++)
    {
        cout << "Planeta " << (i + 1) << ": ";
        cin >> planetas[i];
    }

    sort(planetas, planetas + TAMANHO);

    cout << "Planetas do sistema solar (em ordem alfabética): " << endl;
    for (int i = 0; i < TAMANHO; i++)
    {
        cout << planetas[i] << endl;
    }
    
    return 0;
}
