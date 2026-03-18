package Generics;

public abstract class Lista<T> {

    public abstract void inserirInicio(T item) throws Exception;

    public abstract void inserirOrdenado(T chave) throws Exception;

    public abstract void inserirFim(T item) throws Exception;

    public abstract T removerInicio() throws Exception;

    public abstract T remover(T chave);

    public abstract T removerFim() throws Exception;

    public abstract T buscar(T chave);

    public abstract boolean vazia();

    public abstract boolean cheia();

    public abstract void imprimir();
}