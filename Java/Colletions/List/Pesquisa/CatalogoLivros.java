package Java.Colletions.List.Pesquisa;

import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public void adicionarLivro(String titulo, String autor, Integer anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    //Stream -> uma forma de processar dados de uma coleção, arquivo, banco de dados, etc.
    //executar uma operação em todos os elementos da coleção
    //lista.stream().metodo -> vai executar o metodo em todos os elementos da lista
    public List<Livro> pesquisarPorAutor(String autor) {
        return livros.stream()
                .filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
                .toList();
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        return livros.stream().filter(livro -> livro.getTitulo().startsWith(titulo)).toList();
    }
}
