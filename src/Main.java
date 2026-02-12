import internals.Items;
import internals.ProdutoDigital;
import internals.ProdutoFisico;

public class Main {
    public static void main(String[] args) {
        Items item1 = new ProdutoFisico("Notebook", 3000, 50);
        Items item2 = new ProdutoDigital("Curso Java", 200);

        System.out.println(item1.calcularPrecoFinal());
        System.out.println(item2.calcularPrecoFinal());

    }
}
