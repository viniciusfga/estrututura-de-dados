package Nivel_3;
public class ListaLinear {

    private No inicio;

    public void inserirInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
    }

    public void inserirFim(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = novo;
    }

    public void removerInicio() throws Exception {
        if (inicio == null) throw new Exception("Lista Vazia!");
        inicio = inicio.proximo;
    }

    public void removerFim() throws Exception {
        if (inicio == null) throw new Exception("Lista Vazia!");

        if (inicio.proximo == null) {  // 1 nó
            inicio = null;
            return;
        }

        No atual = inicio;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = null;
    }

    public void removerValor(int valor) throws Exception {
        if (inicio == null) throw new Exception("Lista Vazia!");

        while (inicio != null && inicio.valor == valor) {
            inicio = inicio.proximo;
        }

        No atual = inicio;
        while (atual != null && atual.proximo != null) {
            if (atual.proximo.valor == valor) {
                atual.proximo = atual.proximo.proximo;
            } else {
                atual = atual.proximo;
            }
        }
    }

    public int tamanho() {
        No atual = inicio;
        int contador = 0;
        while (atual != null) {
            contador++;
            atual = atual.proximo;
        }
        return contador;
    }

    public int buscar(int valor) {
        No atual = inicio;
        int posicao = 0;
        while (atual != null) {
            if (atual.valor == valor) return posicao;
            atual = atual.proximo;
            posicao++;
        }
        return -1;
    }

    public void imprimir() {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
}