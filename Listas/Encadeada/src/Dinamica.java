public class Dinamica {

    No primeiro = null;

    public void inserirInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = primeiro;
        primeiro = novo;
    }

    public boolean trocar(int i, int j) {

        // Generics.Lista vazia ou posições negativas
        if (primeiro == null || i < 0 || j < 0) return false;
        if (i == j) return true;

        No atual = primeiro;
        No noI = null;
        No noJ = null;
        int pos = 0;

        while (atual != null) {

            if (pos == i) noI = atual;
            if (pos == j) noJ = atual;

            atual = atual.proximo;
            pos++;
        }

        if (noI == null || noJ == null) return false;

        int temp = noI.valor;
        noI.valor = noJ.valor;
        noJ.valor = temp;

        return true;
    }

    private boolean vazia() {
        return primeiro == null;
    }

    public void inverter() {
        No anterior = null;
        No atual = primeiro;
        No proximo = null;

        while (atual != null) {
            proximo = atual.proximo;   // salva próximo nó
            atual.proximo = anterior;  // inverte ponteiro
            anterior = atual;          // avança anterior
            atual = proximo;           // avança atual
        }

        primeiro = anterior;           // atualiza o início da lista
    }

    public void inserirFim(int valor) {
        No novo = new No(valor);

        if (primeiro == null) {
            primeiro = novo;
            return;
        }

        No atual = primeiro;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = novo;
    }

    public static Dinamica intercalar(Dinamica L1, Dinamica L2) {

        Dinamica L3 = new Dinamica();

        No p1 = L1.primeiro;
        No p2 = L2.primeiro;

        while (p1 != null && p2 != null) {
            if (p1.valor <= p2.valor) {
                L3.inserirFim(p1.valor);
                p1 = p1.proximo;
            } else {
                L3.inserirFim(p2.valor);
                p2 = p2.proximo;
            }
        }

        // Adiciona o restante de L1
        while (p1 != null) {
            L3.inserirFim(p1.valor);
            p1 = p1.proximo;
        }

        // Adiciona o restante de L2
        while (p2 != null) {
            L3.inserirFim(p2.valor);
            p2 = p2.proximo;
        }

        return L3;
    }

    public static Dinamica uniao(Dinamica L1, Dinamica L2) {

        Dinamica L3 = new Dinamica(); // nova lista vazia

        // Percorre L1
        for (No temp = L1.primeiro; temp != null; temp = temp.proximo) {
            L3.inserirFim(temp.valor);
        }

        // Percorre L2
        for (No temp = L2.primeiro; temp != null; temp = temp.proximo) {
            L3.inserirFim(temp.valor);
        }

        return L3;
    }

    public void imprimir() {
        for (No temp = primeiro; temp != null; temp = temp.proximo) {
            System.out.print("[" + temp.valor + "] > ");
        }
        System.out.println("null");
    }
}
