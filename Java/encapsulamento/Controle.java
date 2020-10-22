package encapsulamento;

public class Controle {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.maisVolume();
        controle.maisVolume();
        controle.maisVolume();
        controle.abrirMenu();
        controle.fecharMenu();
        
    }

}
