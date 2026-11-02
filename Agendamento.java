import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agendamento {
    private int id;
    private Usuario usuario;
    private Vaga vaga;
    private LocalDateTime dataHora;
    private String status;

    public Agendamento(int id, Usuario usuario, Vaga vaga, LocalDateTime dataHora) {
        this.id = id;
        this.usuario = usuario;
        this.vaga = vaga;
        this.dataHora = dataHora;
        this.status = "CONFIRMADO";
    }

    public int getId() { return id; }
    public Usuario getUsuario() { return usuario; }
    public Vaga getVaga() { return vaga; }
    public String getStatus() { return status; }

    public void cancelar() {
        status = "CANCELADO";
        vaga.liberar();
    }

    public String mostrarDetalhes() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Código: " + id
                + "\nUsuário: " + usuario.getNome()
                + "\nVaga: " + vaga.getNumero()
                + "\nData e horário: " + dataHora.format(formato)
                + "\nStatus: " + status;
    }
}
