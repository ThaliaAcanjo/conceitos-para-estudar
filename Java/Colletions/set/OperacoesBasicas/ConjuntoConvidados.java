package Java.Colletions.set.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Java.Colletions.List.Ordenacao.Pessoa;

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
    
}

