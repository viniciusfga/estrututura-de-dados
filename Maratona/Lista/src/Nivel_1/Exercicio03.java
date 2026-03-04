package Nivel_1;

// Inserir 5 valores e imprimir manualmente o array.

public class Exercicio03 {

    public static class ListaEstatica {

        int[] elementos;           // Array que armazena os dados
        int quantidade;            // Quantidade atual de elementos na lista

        public ListaEstatica(int capacidade) {
            elementos = new int[capacidade];
            quantidade = 0;
        }

        public void inserirFim(int dados) throws Exception {

            if (quantidade == elementos.length) {
                throw new Exception("Lista Cheia!");
            }

            elementos[quantidade] = dados;
            quantidade++;
        }
    }

    public static void main(String[] args) throws Exception {

        ListaEstatica lista = new ListaEstatica(10);

        lista.inserirFim(1);
        lista.inserirFim(2);
        lista.inserirFim(3);
        lista.inserirFim(4);
        lista.inserirFim(2);

        for (int i = 0; i < 10; i++) {
            System.out.println(lista.elementos[i] + " ");
        }

    }
}
