package entities;

public class Product {
    public String nome;
    public double price;
    public int quantidade;

    
    // Valor total em estoque
    public double ValorTotalEmEstoque(){
        return price * quantidade;
    }

    public void addProdutos(int quantidade){
        this.quantidade = quantidade;
    }

    public void removeProdutos(int quantidade){
        this.quantidade = quantidade;
    }
}