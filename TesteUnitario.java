public class TesteUnitario {
    public static void main(String[] args) {
        Vaga vaga = new Vaga(1, "A01", "Carro");

        vaga.reservar();
        verificar(!vaga.estaDisponivel(), "A vaga deveria estar reservada.");

        vaga.liberar();
        verificar(vaga.estaDisponivel(), "A vaga deveria estar disponivel.");

        System.out.println("Teste unitario aprovado!");
    }

    private static void verificar(boolean condicao, String mensagem) {
        if (!condicao) {
            throw new AssertionError(mensagem);
        }
    }
}
