package Java.Colletions.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoas;

    
    public OrdenacaoPessoa() {
        pessoas = new ArrayList<>();
    }

    private void adicionarPessoa(String nome, Integer idade, Double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
        
        //pessoas.sort((p1, p2) -> p1.getIdade().compareTo(p2.getIdade()));
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;

        //pessoas.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("João", 20, 1.80);        
        ordenacaoPessoa.adicionarPessoa("Maria", 25, 1.70);

        List<Pessoa> pessoasPorIdade = ordenacaoPessoa.ordenarPorIdade();
        List<Pessoa> pessoasPorAltura = ordenacaoPessoa.ordenarPorAltura();

        pessoasPorIdade.forEach(System.out::println);
        pessoasPorAltura.forEach(System.out::println);
    }
}
