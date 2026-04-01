package estruturas.lista.Int;

public class EncadeadaDuplaCircular extends Lista{

    Nodo head;
    Nodo ultimo;

    @Override
    public void inserirInicio(int item) throws Exception {

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
        } else  {
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
        return 0;
    }

    @Override
    public int removerFim() throws Exception {
        return 0;
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
            System.out.print(aux.item +  " ");
            aux = aux.prox;
        } while( aux != head);
    }

    public static void main(String[] args) throws Exception {

        EncadeadaDuplaCircular lista = new EncadeadaDuplaCircular();

        lista.inserirFim(1);
        lista.inserirFim(2);
        lista.inserirFim(3);

        lista.imprimir();
    }
}
