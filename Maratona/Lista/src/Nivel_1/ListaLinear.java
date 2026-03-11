package Nivel_1;

public class ListaLinear {

    int[] elementos;
    int quantidade;

    public ListaLinear(int capacidade) {
        elementos = new int[capacidade];
        quantidade = 0;
    }

    public void imprimeLista() {
        System.out.println("Lista:");
        for (int i = 0; i < elementos.length; i++) {
            System.out.print("[" + elementos[i] + "] ");

        }
    }

    public void inserirFim(int valor) throws Exception {

        if (quantidade >= elementos.length) {
            throw new Exception("Lista cheia!");
        }

        elementos[quantidade++] = valor;
    }

    public void inserirInicio(int valor) throws Exception {

        if (quantidade >= elementos.length) {
            throw new Exception("Lista cheia!");
        }

        for (int i = quantidade; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[0] = valor;
        quantidade++;
    }

    public void inserirPosicao(int valor, int posicao) throws Exception {

        if (quantidade >= elementos.length) throw new Exception("Lista cheia!");
        if (posicao < 0 || posicao >= quantidade) throw new Exception("Posição Inválida!");

        for (int i = quantidade; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[posicao] = valor;
        quantidade++;
    }

    public void removerFim() throws Exception {

        if (quantidade == 0) throw new Exception("Lista Vazia!");
        // O valor normalmente não é apagado da memória.
        // Ele apenas deixa de fazer parte da lista lógica.
        quantidade--;
    }

    public void removerInicio() throws Exception {

        if (quantidade == 0) throw new Exception("Lista Vazia!");

        for (int i = 0; i < quantidade - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        quantidade--;
    }

    public void removerPosicao(int posicao) throws Exception {

        if (quantidade == 0) throw new Exception("Lista Vazia!");
        if (posicao < 0 || posicao >= quantidade) throw new Exception("Posição Inválida!");

        for (int i = posicao; i < quantidade - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        quantidade--;

    }

    public int buscar(int valor) throws Exception {

        if (quantidade == 0) throw new Exception("Lista Vazia!");

        for (int i = 0; i < quantidade; i++) {
            if (elementos[i] == valor) {
                return i;
            }
        }

        return -1;
    }
}
