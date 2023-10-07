package java1;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
    Scanner scaner = new Scanner(System.in);
    System.out.print("Digite um número: "); 
    int num = scaner.nextInt(); 
    scaner.close();
    boolean prim = true;

    if (num <= 1) { 
        prim = false; 
    } else {
        for (int i = 2; i < num; i++) { 
            if (num % i == 0) 
            prim = false;
            break; 
 }
 }
    if (prim) {
        System.out.println("é um número primo"); 
    } else {
        System.out.println("Não é um número primo");
    }
  }
 }