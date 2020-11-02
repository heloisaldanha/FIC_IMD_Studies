package animais;

public abstract class Animal {
    private String especie;
    private float tamanhoCm;
    private String tipoAlimentacao;
    private float tamanhoMaior;

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public float getTamanhoMaior() {
        tamanhoMaior = (getTamanhoCm() * 2); 
        return tamanhoMaior;
    }

    public void setTamanhoMaior(float tamanhoMaior) {
        this.tamanhoMaior = tamanhoMaior;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public float getTamanhoCm() {
        return tamanhoCm;
    }

    public void setTamanhoCm(float tamanhoCm) {
        this.tamanhoCm = tamanhoCm;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void nascer() {
        System.out.printf("Acabei de nascer!! Sou da espécie %s.\n", this.getEspecie());
    }

    public void comer(){
        System.out.println("Comendo, eu dobro de tamanho...");
    }

    public void crescer() {
        if (this.getTamanhoMaior() >= 100){
            System.out.printf("Agora meu tamanho é %.2fm\n", this.getTamanhoMaior() / 100);
        }
        else if (this.getTamanhoMaior() < 100){
            System.out.printf("Agora meu tamanho é %.2fcm\n", this.getTamanhoMaior());
        }
    }


    
}
