package Atividade6;

public class Endereco {

    private final long id;

    private static long ultimoId;

    private boolean ativo;

    public Endereco(){
        id = recuperarId();
    }

    public long  recuperarId(){
        return Endereco.ultimoId++;
    }

    public long getId() {
        return id;
    }

    public static void setUltimoId(long ultimoId) {
        Endereco.ultimoId = ultimoId;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }

}
