package fabrica;

public class Carro {
    String tipo;
    String cor;
    String placa;
    int numPortas;

    //public Carro(String tipo, String cor, String placa, int numPortas){
        //this.tipo = tipo;
        //this.cor = "Branco"; // Inicia a cor do carro com "branco" como padrão.
        //this.placa = placa;
        //this.numPortas = numPortas;
    //}

    public Carro() {
        
    }

    void setTipo(String tipo){
        this.tipo = tipo;
    }

    String getTipo(){
        return tipo;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setPlaca(String placa){
        this.placa = placa;
    }

    String getPlaca(){
        return placa;
    }

    void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }

    int getNumPortas(){
        return numPortas;
    }
    
}

