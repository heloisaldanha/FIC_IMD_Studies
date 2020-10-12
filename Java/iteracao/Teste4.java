
import java.util.Scanner;

public class Teste4 {
    public static void main(String[] args) {
        // Fazer a tabuada de 0 a 10 de um número
        int numero;
        System.out.println("Digite um número:");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        for (int contador = 0; contador <= 10; contador++){
            System.out.printf("%d x %d = %d\n", numero, contador, numero * contador);
        }

    }

}
