package internals;

public class ProdutoFisico extends Items {

    private double taxaEntrega;

    public ProdutoFisico(String nomeItem, double preco, double taxaEntrega) {
        super(nomeItem, preco);
        this.taxaEntrega = taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public double calcularTaxaEntrega() {
        return getPreco() * this.taxaEntrega;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() + taxaEntrega;
    }
}
