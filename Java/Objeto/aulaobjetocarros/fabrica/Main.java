package fabrica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Carro meuCarro = new Carro();
        // Todo carro já vem com o tipo, a cor, "placa" e o número de portas não é mesmo? Essas informações são padrões do objeto.
        // Carro meuCarro2 = new Carro();
        // Um novo objeto criado no código principal, porém, sm nenhum parâmetro, já que o construtor está vazio.
        System.out.println("Cor:");
        meuCarro.setCor(entrada.nextLine());
        System.out.println("Placa:");
        meuCarro.setPlaca(entrada.nextLine());
        System.out.println("Tipo:");
        meuCarro.setTipo(entrada.nextLine());
        System.out.println("Números de portas:");
        meuCarro.setNumPortas(entrada.nextInt());

        System.out.printf("Cor: %s.\n", meuCarro.getCor());
        System.out.printf("Placa: %s.\n", meuCarro.getPlaca());
        System.out.printf("Quantidade de portas: %d\n", meuCarro.getNumPortas());
        System.out.printf("Tipo: %s.\n", meuCarro.getTipo());
    }
}
