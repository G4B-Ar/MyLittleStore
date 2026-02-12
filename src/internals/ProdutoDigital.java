package internals;

public class ProdutoDigital extends Items {
    public  ProdutoDigital(String nomeItem, double preco){
        super(nomeItem, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco();
    }
}
