package internals;

public abstract class Items {
    private String nomeItem;
    private double preco;

    public Items(String nomeItem, double preco) {
        this.nomeItem = nomeItem;
        this.preco = preco;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public double getPreco() {
        return preco;

    }

    public abstract double calcularPrecoFinal();
}
