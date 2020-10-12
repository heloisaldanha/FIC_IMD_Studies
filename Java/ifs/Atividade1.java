package ifs;

import java.util.Scanner;

public class Atividade1 {
    /**
     * Receber 5 números e verificar se a soma deles é múltiplo de dois.
     */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int num1, num2, num3, num4, num5, soma;
        System.out.println("Digite 5 números inteiros:");
        num1 = numeros.nextInt();
        num2 = numeros.nextInt();
        num3 = numeros.nextInt();
        num4 = numeros.nextInt();
        num5 = numeros.nextInt();
        soma = num1 + num2 + num3 + num4 + num5;
        if (soma % 2 == 0) {
            System.out.printf("A soma dos números é igual a %d e é múltiplo de 2.\n", soma);
        } else {
            System.out.printf("A soma é igual a %d e não é múltiplo de 2.\n", soma);
        }
    }

}
