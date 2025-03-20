package Java.Colletions.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        produtos = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtos.add(new Produto(nome, codigo, preco, quantidade));        
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();        
        cadastroProdutos.adicionarProduto("Notebook", 123, 5000.00, 5);
        cadastroProdutos.adicionarProduto("Smartphone", 456, 2000.00, 10);
        cadastroProdutos.adicionarProduto("Tablet", 789, 1500.00, 8);
        cadastroProdutos.adicionarProduto("Notebook", 122, 5000.00, 5); // Duplicata, não adiciona

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
