import java.time.LocalDateTime;

public class TesteIntegracao {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(2, "Carlos", "carlos@email.com");
        Vaga vaga = new Vaga(2, "B02", "Moto");
        SistemaAgendamento sistema = new SistemaAgendamento();

        Agendamento agendamento = sistema.realizarAgendamento(
            usuario, vaga, LocalDateTime.of(2026, 11, 12, 9, 0));

        verificar(agendamento != null, "O agendamento deveria ser criado.");
        verificar("CONFIRMADO".equals(agendamento.getStatus()), "Status incorreto.");
        verificar(!vaga.estaDisponivel(), "A vaga deveria estar reservada.");
        verificar(sistema.listarAgendamentos().size() == 1, "A lista deveria ter um agendamento.");

        agendamento.cancelar();
        verificar("CANCELADO".equals(agendamento.getStatus()), "O agendamento deveria ser cancelado.");
        verificar(vaga.estaDisponivel(), "A vaga deveria ter sido liberada.");

        System.out.println("Teste de integracao aprovado!");
    }

    private static void verificar(boolean condicao, String mensagem) {
        if (!condicao) {
            throw new AssertionError(mensagem);
        }
    }
}
