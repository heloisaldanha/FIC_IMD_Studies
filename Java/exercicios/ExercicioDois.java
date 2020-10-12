package exercicios;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        /**
         * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo, tamanho e elementos do vetor A, 
         * multiplicados por 2, ou seja, B[i] = A[i] * 2.
         */
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[8];
        int[] b = new int[a.length];

        System.out.println("Digite 8 números:");
        for(int contador = 0; contador < a.length; contador++){
            a[contador] = entrada.nextInt();
        }

        for(int contador = 0; contador < b.length; contador++){
            b[contador] = a[contador] * 2;
        }
        
        System.out.print("Os números em b são: ");
        for(int numeros : b){
            System.out.print(numeros + " ");
        }
    }

}
