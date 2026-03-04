package Nivel_1;

/*
Criar método inserirInicio(int valor).

 Verificar se está cheia
 Deslocar todos os elementos uma posição para a direita
 Colocar o novo valor na posição 0
 Incrementar quantidade
 */


public class Exercicio05 {

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

    }

    public static void main(String[] args) throws Exception {

        ListaEstatica lista = new ListaEstatica(10);

        lista.inserirInicio(1);
        lista.inserirInicio(2);
        lista.inserirInicio(3);
        lista.inserirInicio(4);
        lista.inserirFim(2);

        lista.imprimir();

    }
}
