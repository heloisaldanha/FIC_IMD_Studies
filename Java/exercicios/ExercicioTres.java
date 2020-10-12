package exercicios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        /**
         * Criar dois vetores A e B, cada um com 10 elementos inteiros. Construir um vetor C onde cada elemento é a soma dos respectivos elementos em A e B. Ou seja, C[i] = A[i] + B[i].
         */
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        

        System.out.println("Digite 10 números para a lista A:");
        for(int contador = 0; contador < 10; contador++){
            a[contador] = entrada.nextInt();
        }

        System.out.print("Lista A: ");
        for(int numeros : a){
            System.out.print(numeros + " ");
        }

        System.out.println("\n");

        System.out.println("Digite 10 números para a lista B:");
        for(int contador = 0; contador < 10; contador++){
            b[contador] = entrada.nextInt();
        }

        System.out.print("Lista B: ");
        for(int numeros : b){
            System.out.print(numeros + " ");
        }

        System.out.println("\n");

        for(int contador = 0; contador < 10; contador++){
            c[contador] = a[contador] + b[contador];
        }

        System.out.print("Lista C (A + B): ");
        for(int numeros : c){
            System.out.print(numeros + " ");
        }

        System.out.println("\n");
    }

}
