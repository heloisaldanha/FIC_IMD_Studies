package matrizes;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        // Construir uma matriz 3x3
        Scanner entrada = new Scanner(System.in);
        int casas[][] = new int[3][3];
        for(int linha = 1; linha <= casas.length; linha++){
            for(int colunas = 1; colunas <= casas.length; colunas++){
                casas[linha][colunas]= entrada.nextInt();
            }
        }
        for(int linha = 1; linha <= casas.length; linha++){
            for(int colunas = 1; colunas <= casas[linha].length; colunas++){
                System.out.println(casas[linha][colunas]);
            }
        }
    }
}
