package Java.Colletions.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;
    
    public AgendaContatos(){
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.put(nome, numero);
    }

    public void removerContato(String nome){
        if (!contatos.containsKey(nome)){
            System.out.println("Contato nao encontrado.");
            return;
        }
        contatos.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Integer buscarContato(String nome){
        if (!contatos.containsKey(nome)){
            System.out.println("Contato nao encontrado.");
            return null;
        }
        return contatos.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Luan", 1111);
        agendaContatos.adicionarContato("Maria", 2222);
        agendaContatos.adicionarContato("Joao", 3333);
        agendaContatos.adicionarContato("Ana", 4444);   
        agendaContatos.exibirContatos();
        agendaContatos.buscarContato("Joao");
        agendaContatos.removerContato("Joao");
        agendaContatos.exibirContatos();
    }
}