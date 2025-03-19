package Java.Colletions.map.Pesquisa;

public class Produto {
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade) {    
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    
}
