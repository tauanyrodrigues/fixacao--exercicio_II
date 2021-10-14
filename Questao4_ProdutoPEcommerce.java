public class Questao4_ProdutoPEcommerce {

    private int quant_do_Estoque;
    private String nome_do_produto;
    private Double preco_do_produto;

    public Questao4_ProdutoPEcommerce(String nome, int quantidade, double preco){

        this.nome_do_produto = nome;
        this.quant_do_Estoque = quantidade;
        this.preco_do_produto = preco;

    }
    public void ComprarProduto(int quantidade){
        this.quant_do_Estoque = this.quant_do_Estoque - quantidade;
    }

    public String getNomeProduto(){
        return this.nome_do_produto;
    }

    public int getQuantidadeProduto(){

        if(this.quant_do_Estoque >=0 ) {
            return this.quant_do_Estoque;
        }else{
            return 0;
        }
    }
    public double getPrecoProduto(){
        return this.preco_do_produto;
    }
}