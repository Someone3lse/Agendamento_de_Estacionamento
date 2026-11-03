
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario(
            1, "Jose Bezerra", "josebezerra@email.com"
        );

        Vaga vaga = new Vaga(1, "A01", "Carro");

        SistemaAgendamento sistema = new SistemaAgendamento();

        // OUTPUT 1 - VAGA DISPONÍVEL
        System.out.println("===== VAGA DISPONÍVEL =====");

        if (vaga.estaDisponivel()) {
            System.out.println("Vaga: " + vaga.getNumero());
            System.out.println("Status: DISPONÍVEL");
            System.out.println("A vaga pode ser agendada!");
        }

        // Realizando o agendamento
        Agendamento agendamento = sistema.realizarAgendamento(
            usuario,
            vaga,
            LocalDateTime.of(2026, 11, 10, 14, 30)
        );

        // OUTPUT 2 - VAGA INDISPONÍVEL
        System.out.println("\n===== VAGA INDISPONÍVEL =====");

        if (!vaga.estaDisponivel()) {
            System.out.println("Vaga: " + vaga.getNumero());
            System.out.println("Status: INDISPONÍVEL");
            System.out.println("A vaga já está reservada!");
            System.out.println(agendamento.mostrarDetalhes());
        }
    }
}
