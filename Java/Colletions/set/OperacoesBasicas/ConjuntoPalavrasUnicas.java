package Java.Colletions.set.OperacoesBasicas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas = new HashSet<>();


    
    public ConjuntoPalavrasUnicas() {
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public List<String> obterPalavrasUnicas() {
        return new ArrayList<>(palavrasUnicas);
    }

    public Set<String> getPalavrasUnicas() {
        return palavrasUnicas;
    }

    public static void main(String[] args) {ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("null"); 
        conjuntoPalavrasUnicas.adicionarPalavra("banana");
        conjuntoPalavrasUnicas.adicionarPalavra("computador");
        conjuntoPalavrasUnicas.adicionarPalavra("caneca");

        conjuntoPalavrasUnicas.removerPalavra("banana");
        var temPalavra = conjuntoPalavrasUnicas.verificarPalavra("caneca");
        System.out.println(temPalavra);

        System.out.println(conjuntoPalavrasUnicas.obterPalavrasUnicas());
    }
    
}
