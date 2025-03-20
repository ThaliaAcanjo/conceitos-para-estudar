package Java.Colletions.set.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        convidados = new HashSet<>();
    }

    public boolean adicionarConvidado(String nome, int codigoConvite) {
        return convidados.add(new Convidado(nome, codigoConvite));        
    }

    public void  removeConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidado = null;
        for (Convidado c : convidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidado = c;
                break;
            }
        }
        convidados.remove(convidado);
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public Set<Convidado> getConvidados() {
        return convidados;
    }

    public List<Convidado> ordenarPorCodigoConvite(){
        List<Convidado> convidadosPorConvite = new ArrayList<>(convidados);
        Collections.sort(convidadosPorConvite, new comparatorPorCodigoConvite());
        return convidadosPorConvite;    
    }

    /*public v obterConvidados() {
        return new ArrayList<>(convidados);
    }*/
    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();        
        conjunto.adicionarConvidado("Joaquim", 123);
        conjunto.adicionarConvidado("Maria", 456);
        conjunto.adicionarConvidado("João", 789);
        conjunto.adicionarConvidado("Ana", 123); // Duplicata, não adiciona
        
        System.out.println(conjunto.contarConvidados()); // 3        
              
        conjunto.removeConvidadoPorCodigoConvite(123);
        System.out.println(conjunto.contarConvidados()); // 2
        
        System.out.println(conjunto.getConvidados()); // [Convidado{nome='Maria', codigoConvite=456}, Convidado{nome='João', codigoConvite=789}]        
        System.err.println(conjunto.ordenarPorCodigoConvite());
    }
}

