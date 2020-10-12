package exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        /**
         * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos armazenados nesse vetor.
         */
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[10];
        int soma = 0;
        System.out.println("Digite 10 números:");
        for(int contador = 0; contador < 10; contador++){
            a[contador] = entrada.nextInt();
        }

        System.out.print("Vetor A: ");
        for(int numeros : a){
            System.out.print(numeros + " ");
            soma += numeros;
        }

        System.out.println("\n");

        System.out.println("A soma é:\n" + soma);
    

    }

}
