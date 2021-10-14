public class Questao5_ConversaComContato {

    public static void main(String[] args){

        Questao5_contato  professor = new Questao5_contato(992486765, "Italosvaldo Souza");

        professor.enviar_mensagem("\nOlá, Italosvaldo, como vai?");
        professor.getquant_naoLidas();

        professor.men_recebidas("\nVou com os pes");
        professor.men_recebidas("Mas querendo parar");
        professor.men_recebidas("E voce?");
        professor.men_recebidas("ja casou?");
        professor.men_recebidas("Fiquei sabendo do love pelo Jubscleisonilson");

        professor.getquant_naoLidas();
        professor.mensagensNaoLidas();
        professor.getquant_naoLidas();
    }
}
