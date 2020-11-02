package animais;

public class Main {
    public static void main(String[] args) {
        AnimalTerrestre a1 = new AnimalTerrestre();

        a1.setQtdPatas(3);

        System.out.printf("Eu tenho %d patas!\n", a1.getQtdPatas());

        a1.correr();
        a1.setTamanhoCm(15);

        System.out.printf("Meu tamanho é %.2fcm\n", a1.getTamanhoCm());

        a1.comer();
        a1.crescer();


        AnimalSelvagem leao = new AnimalSelvagem();
        
        leao.setComida("zebra");
        leao.setTipoAlimentacao("Carnívoro");
        leao.setOndeVive("Savana");

        leao.cacar();
    }
}
