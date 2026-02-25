public class A2 {

    // Criar o método para inserção em qualquer posição da Lista estática (inserção em ordem).
    public static class listaEstatica {

        private int[] elementos;
        private int tamanho;

        public listaEstatica(int capacidade) {
            this.elementos = new int[capacidade];
            this.tamanho = 0;
        }

        public void inserirEmOrdem(int valor){
            if (tamanho == elementos.length) {
                throw new RuntimeException("Erro: A lista está cheia");
            }

            int posicao = 0;
            while (posicao < tamanho && elementos[posicao] < valor) {
                posicao++;
            }

            for (int i = tamanho - 1; i >= posicao; i--) {
                elementos[i + 1] = elementos[i];
            }

            elementos[posicao] = valor;

            tamanho++;
        }
    }

    public static void main(String[] args) {

        listaEstatica l = new listaEstatica(10);

        l.inserirEmOrdem(2);
        l.inserirEmOrdem(5);
        l.inserirEmOrdem(3);

        for (int i = 0; i < l.elementos.length; i++) {
            System.out.print("[" + l.elementos[i] + "] ");
        }
    }
}
