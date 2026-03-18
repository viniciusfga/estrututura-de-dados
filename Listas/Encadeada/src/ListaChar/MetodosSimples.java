package ListaChar;

public class MetodosSimples {

    StringLista stringLista;

    public void inserirFim(char c) {
        NodoChar novo = new NodoChar(c);
        if (stringLista.head == null) {
            stringLista.head = novo;
            return;
        }
        NodoChar atual = stringLista.head;
        while (atual.prox != null) {
            atual = atual.prox;
        }
        atual.prox = novo;
    }

    public void imprimir() {
        NodoChar atual = stringLista.head;
        while (atual != null) {
            System.out.print(atual.valor);
            atual = atual.prox;
        }
        System.out.println();
    }

    public int tamanho() {
        NodoChar atual = stringLista.head;
        int cont = 0;
        while (atual != null) {
            cont++;
        }
        return cont;
    }

    public boolean estaVazia() {
        return stringLista.head == null;
    }

    public char Obter(int pos) {
        NodoChar atual = stringLista.head;
        for (int i = 0; i < pos; i++) {
            atual = atual.prox;
        }
        return atual.valor;
    }
}
