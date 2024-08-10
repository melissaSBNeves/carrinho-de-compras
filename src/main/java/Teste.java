public class Teste {

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();

        ProdutoNacional produtoNacional01 = new ProdutoNacional("01", "sabonete", "...", 3.0, 2, "Higiene", "São paulo");
        ProdutoNacional produtoNacional02 = new ProdutoNacional("02", "papel higienico", "...", 5.0, 1, "Higiene", "São paulo");
        ProdutoNacional produtoNacional03 = new ProdutoNacional("03", "Arroz", "...", 10.0, 3, "Alimento", "Rio de Janeiro");

        ProdutoImportado produtoImportado01 = new ProdutoImportado("04", "Pasta de dente", "...", 6.00, 2, "Higiene", 2.0, "EUA");
        ProdutoImportado produtoImportado02 = new ProdutoImportado("05", "Coca-cola", "...", 8.00, 2, "Bebida", 4.0, "EUA");
        ProdutoImportado produtoImportado03 = new ProdutoImportado("06", "Miojo", "...", 4.00, 5, "Alimento", 2.0, "Japão");

        carrinho.adicionarProduto(produtoNacional01);
        carrinho.adicionarProduto(produtoNacional02);
        carrinho.adicionarProduto(produtoNacional03);

        carrinho.adicionarProduto(produtoImportado01);
        carrinho.adicionarProduto(produtoImportado02);
        carrinho.adicionarProduto(produtoImportado03);

        for (Produto p : carrinho.getProdutos() ) {
            System.out.println(p);
        }

        System.out.println("Existe produto por código de barra: ");
        System.out.println(carrinho.existeProdutoPorCodigoBarra("01") ? "Existe!" : "Não existe");

        System.out.println("Existe produto por indice: ");
        System.out.println(carrinho.existePorIndice(7) ? "Existe!" : "Não existe");

        System.out.println("Obter produto por indice ");
        System.out.println(carrinho.obterProduto(4));

        System.out.println("Remover produto: ");
        carrinho.removerProduto(0);

        for (Produto p : carrinho.getProdutos() ) {
            System.out.println(p);
        }

        System.out.println("Calculo total: ");
        System.out.println(carrinho.calcularValorTotal());

        System.out.println("Calculo total por categoria: ");
        System.out.println(carrinho.calcularValorTotalPorCategoria("Alimento"));

        System.out.println("Buscar por categoria: ");
        System.out.println(carrinho.buscarPorCategoria("Higiene"));
    }
}
