package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public  class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        itens.removeIf(item -> item.getNome().equals(nome));
    }

    public double calcularValorTotal() {
        Double total = 0.0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public String obterItens() {
        StringBuilder itensString = new StringBuilder();
        for (Item item : itens) {
            itensString.append(item.getNome()).append(" - Quantidade: ").append(item.getQuantidade()).append("\n");
        }
        return itensString.toString();
    }

    public static void main(String[] args) {        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Item 1", 10.99, 2);
        carrinho.adicionarItem("Item 2", 19.99, 1);
        carrinho.adicionarItem("Item 3", 5.99, 3);
        carrinho.removerItem("Item 2");


        System.out.println("Valor total do carrinho: R$" + carrinho.calcularValorTotal());
        System.out.println("Itens no carrinho: " + carrinho.obterItens());
    }
}