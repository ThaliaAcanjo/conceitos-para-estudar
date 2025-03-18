package Java.Colletions.set;

import Java.Colletions.set.OperacoesBasicas.ConjuntoConvidados;
import Java.Colletions.set.OperacoesBasicas.ConjuntoPalavrasUnicas;

public class main {
    public static void main(String[] args) {
        /*ConjuntoConvidados conjunto = new ConjuntoConvidados();        
        conjunto.adicionarConvidado("Joaquim", 123);
        conjunto.adicionarConvidado("Maria", 456);
        conjunto.adicionarConvidado("João", 789);
        conjunto.adicionarConvidado("Ana", 123); // Duplicata, não adiciona
        
        System.out.println(conjunto.contarConvidados()); // 3        
              
        conjunto.removeConvidadoPorCodigoConvite(123);
        System.out.println(conjunto.contarConvidados()); // 2
        
        System.out.println(conjunto.getConvidados()); // [Convidado{nome='Maria', codigoConvite=456}, Convidado{nome='João', codigoConvite=789}]        
        System.err.println(conjunto.ordenarPorCodigoConvite());*/

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
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
