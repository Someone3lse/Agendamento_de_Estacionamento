package agendamento;

public class Agendamento {

    private int id;
    private String nomeUsuario;
    private String data;
    private String horario;
    private String status;

    public Agendamento(int id, String nomeUsuario, String data, String horario) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.data = data;
        this.horario = horario;
        this.status = "Confirmado";
    }

    public void cancelar() {
        status = "Cancelado";
    }

    public String getStatus() {
        return status;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public void mostrarAgendamento() {
        System.out.println("----- AGENDAMENTO -----");
        System.out.println("ID: " + id);
        System.out.println("Usuário: " + nomeUsuario);
        System.out.println("Data: " + data);
        System.out.println("Horário: " + horario);
        System.out.println("Status: " + status);
    }
}