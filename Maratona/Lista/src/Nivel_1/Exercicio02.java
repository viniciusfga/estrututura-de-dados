package Nivel_1;

//Criar método inserirFim(int valor).

public class Exercicio02 {

    public static class Lista {

        int[] elementos;           // Array que armazena os dados
        int quantidade;            // Quantidade atual de elementos na lista
        final int CAPACIDADE = 10; // Capacidade máxima da lista

        public Lista() {
            elementos = new int[CAPACIDADE];
            quantidade = 0;
        }

        public void inserirFim(int dados) throws Exception {
            // VEIRIFCAR SE ESTÁ CHEIA
            if (quantidade == elementos.length) {
                throw new Exception("Lista cheia!");
            }

            elementos[quantidade] = dados;
            quantidade++;
        }
    }
}

