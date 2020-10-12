package ifs;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        /**
         * Pegar quatro notas de um aluno, ver a média e verificar se ele foi aprovado. Considere média 7.0 para aprovação.
         */
        Scanner notas = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media;
        System.out.println("Digite as notas:");
        nota1 = notas.nextFloat();
        nota2 = notas.nextFloat();
        nota3 = notas.nextFloat();
        nota4 = notas.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        if(media >= 7){
            System.out.println("Aluno aprovado!\nParabéns!");
        }
        System.out.println("Fim do programa.");
    }
}
