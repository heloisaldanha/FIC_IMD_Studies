package registros;

import java.util.Scanner;

public class ReceberNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ClassesNotas notas = lerNotas(entrada);
        imprimirNotas(notas);
    

    }

    public static ClassesNotas lerNotas(Scanner entrada){
        ClassesNotas notas = new ClassesNotas();
        System.out.println("Nome do aluno:");
        notas.nome = entrada.nextLine();
        System.out.println("Nome da disciplina:");
        notas.materia = entrada.nextLine();
        System.out.println("Nota 1:");
        notas.nota1 = entrada.nextFloat();
        System.out.println("Nota 2:");
        notas.nota2 = entrada.nextFloat();
        System.out.println("Nota 3:");
        notas.nota3 = entrada.nextFloat();
        notas.media = (notas.nota1 + notas.nota2 + notas.nota3) / 3;
        return notas;
    }

    public static void imprimirNotas(ClassesNotas notas){
        System.out.printf("Aluno: %s\n", notas.nome);
        System.out.printf("Disciplina: %s\n", notas.materia);
        System.out.printf("Nota 1: %.2f\n", notas.nota1);
        System.out.printf("Nota 2: %.2f\n", notas.nota2);
        System.out.printf("Nota 3: %.2f\n", notas.nota3);
        System.out.printf("Média: %.2f\n", notas.media);
    }
}
