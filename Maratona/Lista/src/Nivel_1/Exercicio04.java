package Nivel_1;

//Inserir 5 valores e imprimir manualmente o array.

public class Exercicio04 {

    public static class ListaEstatica {
        private int[] elementos;           // Array que armazena os dados
        private int quantidade;            // Quantidade atual de elementos na lista
        // final int CAPACIDADE = 10; // Capacidade máxima da lista

        public ListaEstatica(int CAPACIDADE) {
            this.elementos = new int[CAPACIDADE];
            this.quantidade = 0;
        }

        public void inserirFim(int dados) throws Exception {

            if (quantidade == elementos.length) {
                throw new Exception("Lista Cheia!");
            }

            elementos[quantidade] = dados;
            quantidade++;
        }
    }

    public static void main(String[] args) {

        ListaEstatica lista = new ListaEstatica(10);

        lista.inserirFim(4);


    }
}
