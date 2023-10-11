#include <iostream>
#include <string>

std::string reverseString(const std::string& str) {
    std::string reversedStr;
    for (int i = str.length() - 1; i >= 0; i--) {
        reversedStr += str[i];
    }
    return reversedStr;
}

int main() {
    std::string str;
    std::cout << "Digite uma string: ";
    std::getline(std::cin, str);

    std::string reversed = reverseString(str);

    std::cout << "String invertida: " << reversed << std::endl;

    return 0;
}
