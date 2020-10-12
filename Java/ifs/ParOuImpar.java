package ifs;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num;
        System.out.println("Digite um número inteiro:");
        num = numero.nextInt();
        if (num % 2 ==0){
            System.out.printf("O Número %d é par!\n", num);
        } else{
            System.out.printf("O número %d é ímpar!\n", num);
        }
        System.out.println("Fim do programa");
    }
}
