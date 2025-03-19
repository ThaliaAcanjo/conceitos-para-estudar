package Java.Colletions.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventos;

    public AgendaEventos() {
        agendaEventos = new HashMap<>();
    }

    public void adicionarEvento(String nome, String atracao, LocalDate date) {
        agendaEventos.put(date, new Evento(nome, atracao, date));
    }

    public void exibirEventos() {
        /*for (Evento evento : agendaEventos.values()) {
            System.out.println(evento.getNome() + " - " + evento.getAtracao() + " - " + evento.getDate());
        }*/
        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agendaEventos);
        System.out.println(agendaTreeMap.values());
        //agendaTreeMap.values().stream().forEach(System.out::println);
    }

    public Evento obterProximoEvento(){        
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agendaEventos);
        /*for (Map.Entry<LocalDate, Evento> entry : agendaTreeMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.isAfter(dataAtual)) {
                return entry.getValue();
            }
        }*/
        //return null;

        return agendaTreeMap.entrySet().stream()
        .filter(entry -> entry.getKey().isAfter(dataAtual))
        .map(Map.Entry::getValue)
        .findFirst()
        .orElse(null);

    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();        

        agenda.adicionarEvento("Evento 1", "Atracao 1", LocalDate.of(2023, 12, 31));
        agenda.adicionarEvento("Evento 2", "Atracao 2", LocalDate.of(2024, 1, 15));
        agenda.adicionarEvento("Evento 3", "Atracao 3", LocalDate.of(2024, 5, 10));

        agenda.exibirEventos();

        Evento proximoEvento = agenda.obterProximoEvento();
        if (proximoEvento == null) {
            System.out.println("Nenhum evento futuro encontrado.");
            return;
        }
        System.out.println("Proximo evento: " + proximoEvento.getNome() + " - " + proximoEvento.getAtracao() + " - " + proximoEvento.getDate());
    }
}
