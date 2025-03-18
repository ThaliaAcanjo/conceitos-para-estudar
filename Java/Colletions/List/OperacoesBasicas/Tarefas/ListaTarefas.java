package Tarefas;
import java.util.List;

public class ListaTarefas {
    List<Tarefa> tarefas;


    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    public Integer obterQuantidadeTarefas() {
        return tarefas.size();
    }
     public List<String> obterDescricoesTarefas() {
        return tarefas.stream().map(Tarefa::getDescricao).toList();
        //return tarefas.stream().map(tarefas -> tarefas.getDescricao()).toList()
    }
}