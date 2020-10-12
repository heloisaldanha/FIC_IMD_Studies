package atividades;

import java.util.Scanner;

public class AlunoNotas {
    public static void main(String[] args) {
        Scanner aluno = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = aluno.nextLine();
        System.out.println("Notas:");
        float nota1, nota2, nota3, nota4, media;
        nota1 = aluno.nextFloat();
        nota2 = aluno.nextFloat();
        nota3 = aluno.nextFloat();
        nota4 = aluno.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("As notas de %s:\nNota 1: %.2f.\nNota 2: %.2f.\nNota 3: %.2f.\nNota 4: %.2f.\n\nMédia: %.2f\n", nome, nota1, nota2, nota3, nota4, media);
        
    }
}
