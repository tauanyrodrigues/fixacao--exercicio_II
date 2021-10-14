public class Questao2_Postagem_facebook {

    public static void main(String[] args){

        Questao2_Postagem Zoeira = new Questao2_Postagem("IFBA não presta, fujam, fujam.", "https://www.youtube.com");
        Zoeira.curtir();
        Zoeira.curtir();
        Zoeira.curtir();
        System.out.println("Quantidade de curtidas: "+Zoeira.getNumCurtidas());

        Zoeira.compartilhar();
        Zoeira.compartilhar();
        System.out.println("Quantidade de compartilhamentos: "+Zoeira.getNumCompartilhamento());

    }
}
