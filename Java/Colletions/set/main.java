package Java.Colletions.set;

import Java.Colletions.set.OperacoesBasicas.ConjuntoConvidados;
import Java.Colletions.set.OperacoesBasicas.ConjuntoPalavrasUnicas;
import Java.Colletions.set.Ordenacao.CadastroProdutos;
import Java.Colletions.set.Pesquisa.AgendaContatos;

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

        /*ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("null"); 
        conjuntoPalavrasUnicas.adicionarPalavra("banana");
        conjuntoPalavrasUnicas.adicionarPalavra("computador");
        conjuntoPalavrasUnicas.adicionarPalavra("caneca");

        conjuntoPalavrasUnicas.removerPalavra("banana");
        var temPalavra = conjuntoPalavrasUnicas.verificarPalavra("caneca");
        System.out.println(temPalavra);

        System.out.println(conjuntoPalavrasUnicas.obterPalavrasUnicas());*/


        /*AgendaContatos agendaContatos = new AgendaContatos();        
        agendaContatos.adicionarContato("Luan", 1111);
        agendaContatos.adicionarContato("Thalia", 2222);
        agendaContatos.adicionarContato("Thalia Silva", 5555);
        agendaContatos.adicionarContato("Ana", 4444); // Duplicata, não adiciona

        System.out.println(agendaContatos.buscarContato("Thalia"));

        agendaContatos.atualizarContato("Thalia Silva", 3333);
        System.out.println(agendaContatos.buscarContato("Thalia"));*/

        CadastroProdutos cadastroProdutos = new CadastroProdutos();        
        cadastroProdutos.adicionarProduto("Notebook", 123, 5000.00, 5);
        cadastroProdutos.adicionarProduto("Smartphone", 456, 2000.00, 10);
        cadastroProdutos.adicionarProduto("Tablet", 789, 1500.00, 8);
        cadastroProdutos.adicionarProduto("Notebook", 122, 5000.00, 5); // Duplicata, não adiciona

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }


}
