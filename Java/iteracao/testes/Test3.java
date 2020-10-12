package testes;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int contador, numeros = 0, soma = 0;
        double media;
        System.out.println("Digite 5 números:");
        for (contador = 1; contador <= 5; contador++){
            Scanner entrada = new Scanner(System.in);
            numeros = entrada.nextInt();
            soma += numeros;
        }
        media = soma / 5;
        System.out.printf("A soma é %d. A média é %.2f\n", soma, media);

    }

}
