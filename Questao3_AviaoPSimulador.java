public class Questao3_AviaoPSimulador {

    private int velocidade, altitude;

    public Questao3_AviaoPSimulador(int velocidade, int altitude){

        this.velocidade = velocidade;
        this.altitude = altitude;

    }
    public void Acelerar(int mais){
        this.velocidade = this.velocidade + mais;
    }
    public void DesaAcelerar(int menos){
        this.velocidade = this.velocidade - menos;
    }
    public int getVelocidade(){
        return this.velocidade;
    }

    public void Subir(int mais){
        this.altitude = this.altitude + mais;
    }
    public void Descer (int menos){
        this.altitude = this.altitude - menos;
    }
    public int getAltitude(){
        return this.altitude;
    }
}
