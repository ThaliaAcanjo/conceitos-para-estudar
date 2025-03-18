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
}