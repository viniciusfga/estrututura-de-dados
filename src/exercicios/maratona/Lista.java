package exercicios.maratona;

abstract class Lista {

    /**
     * Insere um elemento no final da fila.
     * Complexidade esperada: O(1)
     *
     * @param item valor a ser inserido
     * @throws Exception caso ocorra erro na inserção
     */
    public abstract void push(int item) throws Exception;

    /**
     * Remove e retorna o elemento do início da fila.
     * Complexidade esperada: O(1)
     *
     * @return elemento removido
     * @throws Exception se a fila estiver vazia
     */
    public abstract int pop() throws Exception;

    /**
     * Verifica se a fila está vazia.
     *
     * @return true se estiver vazia, false caso contrário
     */
    public abstract boolean isEmpty();

    /**
     * Retorna o elemento do início da fila sem removê-lo.
     *
     * @return elemento do início
     * @throws Exception se a fila estiver vazia
     */
    public abstract int front() throws Exception;

    /**
     * Imprime todos os elementos da fila do início ao fim.
     */
    public abstract void imprimir();
}