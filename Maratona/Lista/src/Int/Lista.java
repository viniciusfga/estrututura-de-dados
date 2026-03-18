package Int;

public abstract class Lista {

    public abstract void inserirInicio(int item) throws Exception;

    public abstract void inserirOrdenado(int chave) throws Exception;

    public abstract void inserirFim(int item) throws Exception;

    public abstract int removerInicio() throws Exception;

    public abstract int remover(int chave);

    public abstract int removerFim() throws Exception;

    public abstract int buscar(int chave);

    public abstract boolean vazia();

    public abstract boolean cheia();

    public abstract void imprimir();
}
