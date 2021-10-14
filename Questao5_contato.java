public class Questao5_contato {

    private int numero, recebidas, quant_naoLidas, quant_envi;

    private String nomeContato;

    String[] menNlidas = new String[1000]; String[] menEnvi = new String[1000];

    public Questao5_contato(int numero, String nome){

        this.nomeContato = nome;
        this.numero = numero;

    }

    public void enviar_mensagem (String mensagem){

        this.menEnvi[quant_envi] = mensagem;
        this.quant_envi++;

    }

    public void men_recebidas(String qual){

        this.menNlidas[this.recebidas] = qual;
        this.recebidas = this.recebidas + 1;

    }

    public void getquant_naoLidas() {

        System.out.println("Quantidade de mensagens não lidas: " + this.recebidas);

    }

    public void mensagensNaoLidas(){

        System.out.println("Mensagens que não foram lidas: ");

        while(this.recebidas > 0){

            System.out.println(this.menNlidas[this.quant_naoLidas]);
            this.quant_naoLidas = this.quant_naoLidas + 1;
            this.recebidas = this.recebidas - 1;

        }

    }

}