package Aula06;

public class ListaDinamica {

    private class No {
        Object valor;
        No prox;

        public No(Object valor) {
            this.valor = valor;
            this.prox = null;
        }
    }

    private No primeiro = null;
    private No ultimo = null;

    public boolean vazia() {
        return primeiro == null;
    }

    public void inserirFim(Object valor) {

        No novo = new No(valor);

        if (vazia()) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.prox = novo;
            ultimo = novo;
        }
    }

    public void inserirInicio(Object valor) {

        No novo = new No(valor);

        if (vazia()) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.prox = primeiro;
            primeiro = novo;
        }
    }

    public void inserirOrdenado(Integer valor) {

        No novo = new No(valor);

        // Caso 1: lista vazia ou menor que o primeiro
        if (vazia() || (Integer) primeiro.valor >= valor) {
            inserirInicio(valor);
            return;
        }

        No atual = primeiro;

        // percorre até achar posição
        while (atual.prox != null &&
                (Integer) atual.prox.valor < valor) {
            atual = atual.prox;
        }

        // encaixar no meio
        novo.prox = atual.prox;
        atual.prox = novo;

        // se inseriu no fim
        if (novo.prox == null) {
            ultimo = novo;
        }
    }

    public void remover(Object valor) {

        No novo = new No(valor);

        // Caso 1: lista vazia ou menor que o primeiro
        if (vazia()) {
            System.out.println("Lista Vazia");
            return;
        }

        // Caso especial: remover o primeiro
        if (primeiro.valor.equals(valor)) {

            primeiro = primeiro.prox;

            // se ficou vazia
            if (primeiro == null) {
                ultimo = null;
            }

            return;
        }

        // Percorrer procurando o valor
        No anterior = primeiro;
        No atual = primeiro.prox;

        while (atual != null && !atual.valor.equals(valor)) {
            anterior = atual;
            atual = atual.prox;
        }

        //Não encontrou
        if (atual == null) {
            System.out.println("Não encontrou");
            return;
        }

        //Remover (pular o nó)
        anterior.prox = atual.prox;

        // Se removeu o último
        if (atual == ultimo) {
            ultimo = anterior;
        }

    }

    public void imprimir() {

        if (vazia()) {
            System.out.println("Lista vazia");
            return;
        }

        No aux = primeiro;

        while (aux != null) {
            System.out.print(aux.valor + " -> ");
            aux = aux.prox;
        }

        System.out.println("null");
    }


    public static void main(String[] args) {

        ListaDinamica lista = new ListaDinamica();

        lista.inserirFim(10);
        lista.inserirFim(20);
        lista.inserirOrdenado(15);
        lista.inserirOrdenado(5);
        lista.inserirOrdenado(30);
        lista.remover(5);

        lista.imprimir();
    }
}