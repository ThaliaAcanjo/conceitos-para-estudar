package Java.Colletions.List.Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    public Livro(String titulo, String autor, Integer anoPublicacao) {  
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao; 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    

    

}
