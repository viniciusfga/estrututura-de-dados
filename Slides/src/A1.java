public class A1 {

    // Criar o método para inserção no início da Lista estática.

    public static class listaEstatica {
        private int[] elementos;
        private int tamanho;

        public listaEstatica(int capacidade) {
            this.elementos = new int[capacidade];
            this.tamanho = 0;
        }

        public void inserirInicio(int valor) {
            if (tamanho == elementos.length) throw new RuntimeException("Erro: A lista está cheia");

            for (int i = tamanho - 1; i >= 0; i--) {
                elementos[i + 1] = elementos[i];
            }

            elementos[0] = valor;
            tamanho++;
        }
    }

    public static void main(String[] args) {

        listaEstatica l = new listaEstatica(10);

        l.inserirInicio(2);
        l.inserirInicio(1);
        l.inserirInicio(1);

        for (int i = 0; i < l.elementos.length; i++) {
            System.out.print("[" + l.elementos[i] + "] ");
        }
    }
}
