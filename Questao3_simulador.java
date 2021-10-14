public class Questao3_simulador {

    public static void main(String[] args){

        Questao3_AviaoPSimulador Katiau = new Questao3_AviaoPSimulador(900, 10);

        System.out.println("\nVelocidade: "+Katiau.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+Katiau.getAltitude()+" Km");

        Katiau.Descer(1);
        Katiau.DesaAcelerar(100);

        System.out.println("\nVelocidade: "+Katiau.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+Katiau.getAltitude()+" Km");

    }
}
