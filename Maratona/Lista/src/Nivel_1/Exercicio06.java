package Nivel_1;

/*
    Criar método inserirPosicao(int valor, int pos).
        Verificar se a lista está cheia
        Verificar se a posição é válida
        Deslocar elementos para a direita
        Inserir o valor na posição
        Incrementar quantidade
 */
public class Exercicio06 {

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
        lista.inserirPosicao(7, 8);
        lista.inserirInicio(4);
        lista.inserirFim(2);

        lista.imprimir();

    }
}
