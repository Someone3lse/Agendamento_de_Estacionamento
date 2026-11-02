public class Vaga {
    private int id;
    private String numero;
    private String tipo;
    private boolean disponivel = true;

    public Vaga(int id, String numero, String tipo) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getId() { return id; }
    public String getNumero() { return numero; }
    public String getTipo() { return tipo; }
    public boolean estaDisponivel() { return disponivel; }

    public void reservar() {
        if (!disponivel) {
            throw new IllegalStateException("A vaga ja esta ocupada.");
        }
        disponivel = false;
    }

    public void liberar() { disponivel = true; }
}
