package internals;

public class ProdutoFisico extends Items {

    private double percentualEntrega;

    public ProdutoFisico(String nomeItem, double preco, double percentualEntrega) {
        super(nomeItem, preco);
        this.percentualEntrega = percentualEntrega;
    }

    public double getTaxaEntrega() {
        return percentualEntrega;
    }

    public double calcularTaxaEntrega() {
        return getPreco() * percentualEntrega;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() + calcularTaxaEntrega();
    }
}
