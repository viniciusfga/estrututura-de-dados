package exercicios.maratona.Int;

public abstract class Lista {

    public abstract void inserirInicio(int item) throws Exception;

    public abstract void inserirOrdenado(int item) throws Exception;

    public abstract void inserirFim(int item) throws Exception;

    public abstract int removerInicio() throws Exception;

    public abstract int remover(int chave) throws Exception;

    public abstract int removerFim() throws Exception;

    public abstract int buscar(int chave) throws Exception;

    public abstract boolean vazia()  throws Exception;

    public abstract boolean cheia();

    public abstract void imprimir();
}
