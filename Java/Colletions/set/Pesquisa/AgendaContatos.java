package Java.Colletions.set.Pesquisa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public Set<Contato> exibirContatos(){
       return contatos;
    }

    public Set<Contato> buscarContato(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        contatos.
            stream().
            filter(contato -> contato.getNome().startsWith(nome)).forEach(contatosPorNome::add);;                
        return contatosPorNome;                
        /*for (Contato contato : contatos) {
            if(contato.getNome().equals(nome)){
                return contato;
            }
        }
        return null;*/
    }
    public void atualizarContato(String nome, int numero){
        contatos.stream().filter(contato -> contato.getNome().equalsIgnoreCase(nome)).forEach(contato -> contato.setNumero(numero));
        /*for (Contato contato : contatos) {  
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(numero);
            }
        }*/
    }
}
