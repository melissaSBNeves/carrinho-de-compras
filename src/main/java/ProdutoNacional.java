public class ProdutoNacional extends Produto{

    private String estadoOrigem;

    public ProdutoNacional(String codigoBarras, String nome, String decricao, Double preco, Integer quantidade, String categoria, String estadoOrigem) {
        super(codigoBarras, nome, decricao, preco, quantidade, categoria);
        this.estadoOrigem = estadoOrigem;
    }

    @Override
    public Double calcularPrecoUnitario() {
        return preco;
    }

    @Override
    public Double calcularPrecoTotal() {
        return preco * quantidade;
    }

    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    public void setEstadoOrigem(String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }

    @Override
    public String toString() {
        return """
               %s
               Estado de origem: %s
               """.formatted(super.toString(), estadoOrigem);
    }
}
