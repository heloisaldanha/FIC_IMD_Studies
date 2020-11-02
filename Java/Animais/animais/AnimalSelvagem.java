package animais;

public class AnimalSelvagem extends AnimalTerrestre {
    private String ondeVive;
    private String comida;

    public String getOndeVive() {
        return ondeVive;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public void setOndeVive(String ondeVive) {
        this.ondeVive = ondeVive;
    }
    
    public void cacar(){
        System.out.printf("Sou %s e como %s aqui no meu habitat: %s.\n", this.getTipoAlimentacao(), this.getComida(), this.getOndeVive());
    }
}
