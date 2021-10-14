public class Questao2_Postagem {

    private String text, link;
    private int NumCurtidas, NumCompartilhamentos;

    public Questao2_Postagem(String text, String link){

        this.text = text;
        this.link = link;

    }
    public void curtir(){
        this.NumCurtidas = this.NumCurtidas + 1;
    }
    public int getNumCurtidas(){
        return this.NumCurtidas;
    }

    public void compartilhar(){
        this.NumCompartilhamentos = this.NumCompartilhamentos + 1;
    }
    public int getNumCompartilhamento(){
        return this.NumCompartilhamentos;
    }
}
