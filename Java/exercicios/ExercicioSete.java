package exercicios;

import java.util.Random;

public class ExercicioSete {
    public static void main(String[] args) {
        /**
         * Gere e imprima uma matriz M 10x10 com valores aleatórios entre 10 e 100. Após isso, indique qual é o maior valor e o menor valor da linha 5 e o maior valor da coluna7.
         */
        int[][] m = new int[10][10];
        Random numerosAleatorios = new Random();

        for(int linha = 0; linha < m.length; linha++){
            for(int coluna = 0; coluna < m[linha].length; coluna++){
                m[linha][coluna] = numerosAleatorios.nextInt(100);
            }
        }

        for(int linha = 0; linha < m.length; linha++){
            for(int coluna = 0; coluna < m[linha].length; coluna++){
                System.out.printf("[%d] ", m[linha][coluna]);
            }

        System.out.println();

        }
        
        int maior_5 = Integer.MIN_VALUE;
        int menor_5 = Integer.MAX_VALUE;
        int linha_5 = 5;
        for(int linha = 0; linha < m[linha_5].length; linha++){
            if(m[linha_5][linha] > maior_5){
                maior_5 = m[linha_5][linha];
            }

            if(m[linha_5][linha] < menor_5){
                menor_5 = m[linha_5][linha];
            }
            

        }
        System.out.printf("O maior número da linha 5 é %d.\n", maior_5);
        System.out.printf("O menor número da linha 5 é %d.\n", menor_5);


        int maior_7 = Integer.MIN_VALUE;
        for(int linha = 0; linha < m.length; linha++){
            for(int coluna = 0; coluna < m[linha].length; coluna++){
                if(m[linha][7] > maior_7){
                    maior_7 = m[linha][7];
                }

            }

        }

        System.out.printf("O maior número da coluna 7 é %d.\n", maior_7);
    }

}
