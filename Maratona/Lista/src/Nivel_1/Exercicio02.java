package Nivel_1;

    //Criar método inserirFim(int valor).

public class Exercicio02 {

    public class Lista {

        private int[] elementos;
        private int tamanho;

        public Lista() {
            elementos = new int[10]; // array com capacidade 10
            tamanho = 0;             // lista começa vazia
        }

        public void inserirFim(int valor) throws Exception {
            if (tamanho == elementos.length) {
                throw new Exception("Lista cheia!");
            }

            elementos[tamanho] = valor;
            tamanho++;
        }
    }
}
