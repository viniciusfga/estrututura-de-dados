package Int;

public class EncadeadaDupla extends Lista {

    Nodo head;
    Nodo ultimo;

    @Override
    public void inserirInicio(int item) throws Exception {
        Nodo novo = new Nodo(item);
        if (vazia()){
            head = novo;
            ultimo = novo;
        } else {
            novo.prox = head;
            head.ant = novo;
            head = novo;
        }
    }

    @Override
    public void inserirOrdenado(int item) throws Exception {
        Nodo novo = new Nodo(item);

        if (vazia()){
            head = novo;
            ultimo = novo;
        } else if (head.item > item) {
            novo.prox = head;
            head.ant = novo;
            head = novo;
        } else {
            Nodo aux = head;
            while (aux.prox != null && aux.prox.item < item){
                aux = aux.prox;
            }

            // Inserir no final
            if(aux.prox == null){
                aux.prox = novo;
                novo.ant = aux;
                ultimo = novo;
            }
            // Inserir no meio
            novo.prox = aux.prox;
            novo.ant = aux;
            aux.prox.ant = novo;
            aux.prox = novo;
        }
    }

    @Override
    public void inserirFim(int item) throws Exception {
        Nodo novo = new Nodo(item);
        if (vazia()) {
            head = novo;
            ultimo = novo;
        } else {
            ultimo.prox = novo;
            novo.ant = ultimo;
            ultimo = novo;
        }

    }

    @Override
    public int removerInicio() throws Exception {
        if (vazia()) throw new Exception("Lista vazia!");

        int valorRemovido = head.item;
        // Caso 1: só um elemento
        if (head.prox == null){
            head = null;
            ultimo = null;
        }
        // Caso 2: mais de um elemento
        else {
            head = head.prox;
            head.ant = null;
        }

        return valorRemovido;
    }

    @Override
    public int remover(int chave) throws Exception {
        if (vazia()) throw new Exception("Lista vazia!");

        return 0;
    }

    @Override
    public int removerFim() throws Exception {
        if (vazia()) throw new Exception("Lista vazia!");

        int valorRemovido = ultimo.item;
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
        if (head == null) return;

        Nodo aux = head;
        while (aux != null) {
            System.out.print("[" + aux.item + "] ");
            aux = aux.prox;
        }
    }

    public static void main(String[] args) throws Exception {

        EncadeadaDupla lista = new EncadeadaDupla();

        lista.inserirFim(1);
        lista.inserirFim(2);
        lista.inserirFim(3);
        lista.inserirInicio(4);

        lista.imprimir();
    }
}
