package animais;

public class AnimalTerrestre extends Animal {
    private int qtdPatas;

    public AnimalTerrestre() {
        qtdPatas = 4;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }
    
    public void correr(){
        System.out.printf("Eu uso minhas %d patas para correr.\n", this.getQtdPatas());
    }
}
