package Java.Colletions.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome,  double preco, int quantidade) {
        estoqueProdutos.put(codigo, new Produto(nome, codigo, preco, quantidade));
    }

    public void exibirProdutos() {
        // for (Produto produto : estoqueProdutos.values()) {
        //     System.out.println(produto.toString());
        // }
        estoqueProdutos.values().forEach(System.out::println);
    }

    public double obterValorTotalEstoque() {
        //forma 1 - tradicional
        /*double soma = 0.0;
        for (Produto produto : estoqueProdutos.values()) {    
            soma += produto.getPreco();
        }
        return soma;*/
                
        return estoqueProdutos.values().stream().mapToDouble(produto -> produto.getPreco() * produto.getQuantidade()).sum();

    }

    public Produto obterProdutoMaiorPreco() {
        return estoqueProdutos.values().stream().max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())).get();
    }
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1L, "Notebook", 3000.0, 10);
        estoqueProdutos.adicionarProduto(2L, "Smartphone", 1500.0, 5);
        estoqueProdutos.adicionarProduto(3L, "Tablet", 1200.0, 8);
        
        estoqueProdutos.exibirProdutos();
        
        System.out.println(estoqueProdutos.obterProdutoMaiorPreco().getPreco());
        
        System.out.println(estoqueProdutos.obterValorTotalEstoque());
    }  
}


