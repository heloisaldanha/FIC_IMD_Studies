package para;
import java.util.Scanner;

public class Para1 {
    public static void main(String[] args) {
        long numero = Math.round(Math.random() * 10);
		long chute;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 10");
		chute = leitor.nextLong();
		while (numero != chute) {
			System.out.println("Digite um número entre 1 e 10");
			chute = leitor.nextLong();
		}
		System.out.println("Você acertou!");
        
    }
}
