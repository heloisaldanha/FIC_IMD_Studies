package encapsulamento;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;


    // Métodos especiais
    public ControleRemoto() {
        this.volume = 1;
        this.ligado = false;
        this.tocando = false;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    // Im plementando métodos abstratos

    @Override
    public void ligar() {
        setLigado(true);

    }

    @Override
    public void desligar() {
        setLigado(false);

    }

    @Override
    public void abrirMenu() {
        System.out.println("---- MENU ---- ");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int barrinha  = 0; barrinha < this.getVolume(); ++ barrinha){
            System.out.print("|");
        }

        System.out.println("");

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado())
            this.setVolume(this.getVolume() + 1);
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        }

    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(volume);
        }
        
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){ // ! == não (se tiver ligado E NÃO estiver tocando)
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }

    } 

}
