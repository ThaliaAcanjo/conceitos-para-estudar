package Java.Colletions.set.OperacoesBasicas;

import java.util.Comparator;

public class Convidado implements Comparable<Convidado> {
    private String nome;
    private int codigoConvite;
    
    
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }


    public String getNome() {
        return nome;
    }


    public int getCodigoConvite() {
        return codigoConvite;
    }


    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }


    @Override
    public int compareTo(Convidado c) {
        return Integer.compare(c.getCodigoConvite(), this.getCodigoConvite());
    }
}


class comparatorPorCodigoConvite implements Comparator<Convidado>{
    @Override
    public int compare(Convidado c1, Convidado c2) {
        return Integer.compare(c1.getCodigoConvite(), c2.getCodigoConvite());
    }
}