package Nivel_1;

import java.util.Arrays;

//Criar método removerFim().
public class Exercicio07 {

    public static class ListaEstatica {

        private int[] elementos;
        private int quantidade;

        public ListaEstatica(int capacidade) {
            this.elementos = new int[capacidade];
            this.quantidade = 0;
        }

        // VERIFICAÇÃO

        public void imprimir() {
            if (estaVazia()) {
                System.out.println("Lista vazia.");
                return;
            }

            for (int i = 0; i < quantidade; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }

        private boolean estaVazia() {
            return quantidade == 0;
        }

        // INSERÇÃO

        public void inserirFim(int valor) throws Exception {
            if (full()) {
                throw new Exception("Lista cheia");
            }

            elementos[quantidade] = valor;
            quantidade++;
        }

        private boolean full() {
            return quantidade == elementos.length;
        }

        public void inserirInicio(int valor) throws Exception {
            if (full()) {
                throw new Exception("Lista cheia");
            }

            for (int i = quantidade - 1; i >= 0; i--) {
                elementos[i + 1] = elementos[i];
            }

            elementos[0] = valor;
            quantidade++;

        }

        public void inserirPosicao(int valor, int pos) throws Exception {
            if (full()) {
                throw new Exception("Lista cheia!");
            }

            if (pos < 0 || pos > quantidade) {
                throw new Exception("Posição inválida!");
            }

            for (int i = quantidade - 1; i >= pos; i--) {
                elementos[i + 1] = elementos[i];
            }

            elementos[pos] = valor;
            quantidade++;
        }

        public void removerFim() throws Exception{

            if (estaVazia()) {
                throw new Exception("Lista vazia.");
            }

            quantidade--;
        }

        public String toString() {
            return Arrays.toString(Arrays.copyOf(elementos, quantidade));
        }
    }

    public static void main(String[] args) throws Exception {

        Exercicio07.ListaEstatica lista = new Exercicio07.ListaEstatica(6);

        lista.inserirInicio(1);
        lista.inserirInicio(2);
        lista.inserirInicio(3);
        System.out.println(lista.toString());

        lista.inserirPosicao(7, 1);
        System.out.println(lista.toString());

        lista.inserirInicio(4);
        lista.inserirFim(2);
        System.out.println(lista.toString());

        lista.removerFim();
        System.out.println(lista.toString());

    }
}
