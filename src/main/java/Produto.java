public abstract class Produto {

    protected String codigoBarras;
    protected String nome;
    protected String decricao;
    protected Double preco;
    protected Integer quantidade;
    protected String categoria;

    public Produto(String codigoBarras, String nome, String decricao, Double preco, Integer quantidade, String categoria) {
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.decricao = decricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }


    public abstract Double calcularPrecoUnitario();
    public abstract Double calcularPrecoTotal();

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return """
               *------ Produto ------*
               Código de barras: %s
               Nome: %s
               Descrição: %s
               Categoria: %s
               Preço: R$%.2f
               Quantidade: %d
               Total: R$%.2f""".formatted(codigoBarras, nome, decricao, categoria, preco, quantidade, calcularPrecoTotal());

    }
}
