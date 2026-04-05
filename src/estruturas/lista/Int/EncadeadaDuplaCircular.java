package estruturas.lista.Int;

public class EncadeadaDuplaCircular extends Lista {

    Nodo head;
    Nodo ultimo;

    @Override
    public void inserirInicio(int item) throws Exception {

        Nodo novo = new Nodo(item);

        if (vazia()) {
            head = novo;
            ultimo = novo;

            head.prox = novo;
            head.ant = novo;
        } else {
            ultimo.prox = novo;
            novo.ant = ultimo;

            novo.prox = head;
            head.ant = novo;

            head = novo;
        }
    }

    @Override
    public void inserirOrdenado(int item) throws Exception {

    }

    @Override
    public void inserirFim(int item) throws Exception {

        Nodo novo = new Nodo(item);

        if (vazia()) {
            head = novo;
            ultimo = novo;

            head.prox = head;
            head.ant = head;
        } else {
            novo.ant = ultimo;
            novo.prox = head;

            ultimo.prox = novo;
            head.ant = novo;

            ultimo = novo;
        }
    }

    @Override
    public int removerInicio() throws Exception {
        return 0;
    }

    @Override
    public int remover(int chave) throws Exception {

        int valorRemovido;

        if (vazia()) {
            throw new Exception("Lista vazia");
        }

        // CASO 1: lista com um único elemento
        if (head == ultimo && head.item == chave) {
            valorRemovido = head.item;
            head = null;
            ultimo = null;
            return valorRemovido;
        }

        // CASO 2: remover o primeiro
        if (head.item == chave) {
            valorRemovido = head.item;

            head = head.prox;
            head.ant = ultimo;
            ultimo.prox = head;

            return valorRemovido;
        }
        // CASO 03: remover o ultimo
        else if (ultimo.item == chave) {
            valorRemovido = ultimo.item;

            ultimo = ultimo.ant;
            ultimo.prox = head;

            head.ant = ultimo;

            return valorRemovido;
        }
        // CASO 03: remover no meio
        else {

            Nodo aux = head.prox;

            while (aux != head && aux.item != chave) {
                aux = aux.prox;
            }
            if (aux == head) {
                throw new Exception("Elemento não encontrado");
            }
            valorRemovido = aux.item;

            aux.ant.prox = aux.prox;
            aux.prox.ant = aux.ant;

            return valorRemovido;
        }
    }

    @Override
    public int removerFim() throws Exception {

        if (vazia()) {
            throw new Exception("Lista vazia");
        }

        int valorRemovido = ultimo.item;

        if (head == ultimo) {
            head = null;
            ultimo = null;
        } else {
            ultimo = ultimo.ant;
            ultimo.prox = head;
            head.ant = ultimo;
        }
        return valorRemovido;
    }

    @Override
    public int buscar(int chave) throws Exception {
        return 0;
    }

    @Override
    public boolean vazia() throws Exception {
        return head == null;
    }

    @Override
    public boolean cheia() {
        return false;
    }

    @Override
    public void imprimir() {
        Nodo aux = head;

        do {
            System.out.print(aux.item + " ");
            aux = aux.prox;
        } while (aux != head);
    }

    public static void main(String[] args) throws Exception {

        EncadeadaDuplaCircular lista = new EncadeadaDuplaCircular();

        lista.inserirFim(1);
        lista.inserirFim(2);
        lista.inserirFim(3);

        lista.inserirInicio(0);

        lista.remover(2);

        lista.imprimir();
    }
}
