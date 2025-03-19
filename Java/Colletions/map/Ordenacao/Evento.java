package Java.Colletions.map.Ordenacao;

import java.time.LocalDate;

public class Evento {
    private String nome;
    private String atracao;
    private LocalDate date;

    public Evento(String nome, String atracao, LocalDate date) {
        this.nome = nome;
        this.atracao = atracao;
        this.date = date;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    public LocalDate getDate() {
        return date;
    }

    
}
