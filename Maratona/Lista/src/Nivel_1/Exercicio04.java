package Nivel_1;

//Criar método imprimir() para mostrar todos os elementos da lista.

public class Exercicio04 {

    public static class ListaEstatica {

        private int[] elementos;
        private int quantidade;

        public ListaEstatica(int capacidade) {
            this.elementos = new int[capacidade];
            this.quantidade = 0;
        }

        public void inserirFim(int valor) throws Exception {
            // VAZIO
            if (full()) {
                throw new Exception("Lista Cheia");
            }

            elementos[quantidade] = valor;
            quantidade++;

        }

        private boolean full() {
            return quantidade == elementos.length;
        }

        public void imprimir() {
            for (int i = 0; i < elementos.length; i++) {
                System.out.println(elementos[i] + " ");
            }
        }
    }

    public static void main(String[] args) throws Exception {

        ListaEstatica lista = new ListaEstatica(10);

        lista.inserirFim(1);
        lista.inserirFim(2);
        lista.inserirFim(3);
        lista.inserirFim(4);
        lista.inserirFim(2);

        lista.imprimir();

    }

}
