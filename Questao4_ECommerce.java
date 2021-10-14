public class Questao4_ECommerce {

    public static void main(String[] args){

        Questao4_ProdutoPEcommerce p_leitinho = new Questao4_ProdutoPEcommerce("Leitinho", 10, 14);

        System.out.println("\n\nProduto: "+p_leitinho.getNomeProduto());
        System.out.println("Preco: "+p_leitinho.getPrecoProduto());

        p_leitinho.ComprarProduto(1);
        System.out.println("Quantidade em estoque: "+p_leitinho.getQuantidadeProduto());

        p_leitinho.ComprarProduto(1);
        System.out.println("Quantidade em estoque: "+p_leitinho.getQuantidadeProduto());

        p_leitinho.ComprarProduto(9);
        System.out.println("Quantidade em estoque: "+p_leitinho.getQuantidadeProduto());

    }
}
