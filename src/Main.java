import internals.Items;
import internals.ProdutoDigital;
import internals.ProdutoFisico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a minha loja, aventureiro! Agora online! Maneiro, né?!");
        System.out.println("Ó, armas e armaduras são pesadas e é só eu que entrego tudo... Então,tem uma taxa.\n");

        List<Items> loja = new ArrayList<>();
        loja.add(new ProdutoFisico("Espada de ferro",90,0.6));
        loja.add(new ProdutoFisico("Armadura do faminto", 80, 0.8));
        loja.add(new ProdutoDigital("Chip da Benevolencia",200));
        loja.add(new ProdutoDigital("Chip de cura (pequena)",30));

        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("=================================");
        System.out.println("\nOque vai querer?\n");
        for (int i = 0; i < loja.size(); i++) {
            Items item = loja.get(i);
            System.out.printf("%d - %s [G %d]\n", i + 1, item.getNomeItem(), (int)item.calcularPrecoFinal());
        }

        System.out.println("==============================");
        System.out.println("(numero do item)");
        int numero = sc.nextInt();

        if(numero < 1 || numero > loja.size()) {
            System.out.println("Opção inválida!");
        } else{
            Items item = loja.get(numero - 1);
            System.out.println("Você comprou: " + item.getNomeItem() + " por " + (int)item.calcularPrecoFinal() + " Gs");
        }

        sc.close();
    }
}
