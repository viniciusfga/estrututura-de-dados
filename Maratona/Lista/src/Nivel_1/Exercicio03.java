package Nivel_1;

// Criar método inserirFim(int valor).

public class Exercicio03 {

    public static class Lista {

        int[] elementos;           // Array que armazena os dados
        int quantidade;            // Quantidade atual de elementos na lista
        final int CAPACIDADE = 10; // Capacidade máxima da lista

        public Lista() {
            elementos = new int[CAPACIDADE];
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
}
