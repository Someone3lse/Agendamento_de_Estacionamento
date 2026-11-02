import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaAgendamento {
    private List<Agendamento> agendamentos = new ArrayList<Agendamento>();
    private int proximoId = 1;

    public Agendamento realizarAgendamento(Usuario usuario, Vaga vaga, LocalDateTime dataHora) {
        if (usuario == null || vaga == null || dataHora == null) {
            throw new IllegalArgumentException("Preencha todos os dados do agendamento.");
        }
        if (!vaga.estaDisponivel()) {
            throw new IllegalStateException("A vaga esta ocupada.");
        }

        vaga.reservar();
        Agendamento novo = new Agendamento(proximoId, usuario, vaga, dataHora);
        agendamentos.add(novo);
        proximoId++;
        return novo;
    }

    public List<Agendamento> listarAgendamentos() {
        return new ArrayList<Agendamento>(agendamentos);
    }
}
