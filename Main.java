import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Maria Eduarda", "maria@email.com");
        Vaga vaga = new Vaga(1, "A01", "Carro");
        SistemaAgendamento sistema = new SistemaAgendamento();

        try {
            Agendamento agendamento = sistema.realizarAgendamento(
                usuario, vaga, LocalDateTime.of(2026, 11, 10, 14, 30));

            System.out.println("================================");
            System.out.println("       SISTEMA DE AGENDAMENTO");
            System.out.println("================================");
            System.out.println(agendamento.mostrarDetalhes());
            System.out.println("--------------------------------");
            System.out.println("Agendamento realizado com sucesso!");
            System.out.println("Vaga disponível: " + (vaga.estaDisponivel() ? "Sim" : "Não"));
        } catch (RuntimeException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
