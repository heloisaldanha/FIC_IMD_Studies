package exercicios;

import java.util.Random;

public class ExercicioSeis {
    public static void main(String[] args) {
        /**
         * Gere e imprima uma matriz 4x4 com valores aleatórios entre 0 e 100. Após isso, determine o valor maior da matriz e sua posição (linha e coluna).
         */
        int[][] pulguenta = new int[4][4];
        Random numeroRandom = new Random();
        for(int linha = 0; linha < pulguenta.length; linha++){
            for(int coluna = 0; coluna < pulguenta[linha].length; coluna++){
                pulguenta[linha][coluna] = numeroRandom.nextInt(100);
            }

        }
        int maior = 0;
        int lin = 0;
        int col = 0;
        for(int linha = 0; linha < pulguenta.length; linha++){
            for(int coluna = 0; coluna < pulguenta[linha].length; coluna++){
                if(pulguenta[linha][coluna] > maior){
                    maior = pulguenta[linha][coluna];
                    lin = linha;
                    col = coluna;
                }

            }

        }

        for(int linha = 0; linha < pulguenta.length; linha++){
            for(int coluna = 0; coluna < pulguenta[linha].length; coluna++){
                System.out.print(pulguenta[linha][coluna] + " ");
            }
        System.out.println();

        }

        System.out.printf("O maior número da matriz é: %d e se encontra na linha: %d, coluna: %d.\n", maior, lin, col);
    }

}
