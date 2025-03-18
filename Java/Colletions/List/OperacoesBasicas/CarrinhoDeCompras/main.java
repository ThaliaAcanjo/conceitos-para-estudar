package CarrinhoDeCompras;

public class main {
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
