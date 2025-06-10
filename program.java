import java.util.Scanner;
import entities.Product;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product a = new Product();

        // Nome
        System.out.print("Digite o nome do produto: ");
        a.nome = sc.nextLine();
        // Preço
        System.out.print("Digite o preco do produto: ");
        a.price = sc.nextDouble();
        // Quantidade
        System.out.print("Digite a quantidade do produto: ");
        a.quantidade = sc.nextInt();
        // sc.close();

        double valorTotal = a.ValorTotalEmEstoque();
        System.out.printf("Valor total em estoque: %.2f%n%n", valorTotal);

        System.out.print("Digite a nova quantidade A MAIS do produto: ");
        a.addProdutos(sc.nextInt());
        System.out.printf("Quantidade do produto: %d%n", a.quantidade);

        System.out.print("Digite a nova quantidade A MENOS do produto: ");
        a.removeProdutos(sc.nextInt());
        System.out.printf("Quantidade do produto: %d%n", a.quantidade);
    }
}
