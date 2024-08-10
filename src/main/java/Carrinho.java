import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public Boolean existeProdutoPorCodigoBarra(String codigoBarras){

        Boolean existe = false;

        for (Produto p: produtos) {

            if(p.codigoBarras.equals(codigoBarras)){
                existe = true;
            }

        }

        return existe;
    }

    public void adicionarProduto(Produto produto){

        if(!existeProdutoPorCodigoBarra(produto.codigoBarras)){
            produtos.add(produto);
        }

    }

    public Boolean existePorIndice(Integer indice){

        Boolean existe = false;
        for (int i = 0; i < produtos.size(); i++) {

            if(i == indice){
                existe = true;
            }
        }

        return existe;
    }

    public void removerProduto(Integer indice){

        for (int i = 0; i < produtos.size(); i++) {

            if(i == indice){
                produtos.remove(i);
            }
        }

    }

    public Produto obterProduto(Integer indice){

        Produto produto = null;

        for (int i = 0; i < produtos.size(); i++) {

            if(i == indice){
                produto = produtos.get(i);
            }
        }

        return produto;
    }

    public Double calcularValorTotal(){

        Double total = 0.;
        for (Produto p: produtos) {

            total += p.calcularPrecoTotal();

        }

        return total;
    }

    public Double calcularValorTotalPorCategoria(String categoria){

        Double total = 0.;

        for (Produto p: produtos) {

            if(p.categoria.equals(categoria)){
                total += p.calcularPrecoTotal();
            }
        }

        return total;
    }

    public List<Produto> buscarPorCategoria(String categoria){

        List<Produto> listaProdutosCategoria = new ArrayList<>();

        for (Produto p : produtos) {

            if(p.categoria.equals(categoria)){
                listaProdutosCategoria.add(p);
            }
        }

        return listaProdutosCategoria;

    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return """
               Carrinho
               %s
               """.formatted(produtos);
    }
}
