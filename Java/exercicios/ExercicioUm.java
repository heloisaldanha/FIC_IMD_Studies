package exercicios;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        /**
         * Criar um vetor A com 5 elementos inteiros. Contruir um vetor B de mesmo tipo e tamanho com os mesmos elementos.
         * Ou seja, B[i] = A[i].
         */
        Scanner entrada = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];

        System.out.println("Digite 10 números inteiros:");
        for(int contador = 0; contador < a.length; contador++){
            a[contador] = entrada.nextInt();

        }

        for(int contador = 0; contador < b.length; contador++){
            b[contador] = a[contador];
        }
        
        for(int numeros : b){
            System.out.print(numeros + " ");
        }

    }

}

// ok