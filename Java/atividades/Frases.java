package atividades;

import java.util.Scanner;

public class Frases {
    public static void main(String[] args) {
        Scanner frase1 = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String primeira_frase = frase1.nextLine();
        Scanner frase2 = new Scanner(System.in);
        System.out.println("Digite outra frase:");
        String segunda_frase = frase2.nextLine();
        System.out.println("Digite uma terceira frase:");
        Scanner frase3 = new Scanner(System.in);
        String terceira_frase = frase3.nextLine();
        System.out.printf("A primeira frase digitada foi: %s.\nA segunda frase digitada foi: %s.\nA última frase digitada foi: %s.\n",
        primeira_frase, segunda_frase, terceira_frase);
    }
}
