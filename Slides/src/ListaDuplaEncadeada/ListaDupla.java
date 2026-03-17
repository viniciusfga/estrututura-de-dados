package ListaDuplaEncadeada;

public class ListaDupla {

    private NoDuplo head;
    private NoDuplo ultimo;

    public boolean vazia() {
        return head == null;
    }

    public void insereFim(int valor) {

        NoDuplo novo = new NoDuplo(valor);

        if (vazia()) {
            head = novo;
            ultimo = novo;
        } else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }

    public void trocarValor(int pos1, int pos2) {

        if(posIguais(pos1, pos2)) return;
        if (vazia()) return;

        NoDuplo no1 = head;
        NoDuplo no2 = head;

        for (int i = 0; i < pos1; i++) { no1 = no1.getProximo(); }
        for (int i = 0; i < pos2; i++) { no2 = no2.getProximo(); }

        int temp = no1.getValor();
        no1.setValor(no2.getValor());
        no2.setValor(temp);

    }

    public boolean posIguais(int pos1, int pos2) {
        return pos1 == pos2;
    }

    public void trocarNo(int pos1, int pos2) {

        if (pos1 == pos2) return;
        if (vazia()) return;

        // garantir ordem (pos1 < pos2)
        if (pos1 > pos2) {
            int temp = pos1;
            pos1 = pos2;
            pos2 = temp;
        }

        NoDuplo no1 = head;
        NoDuplo no2 = head;

        for (int i = 0; i < pos1; i++) no1 = no1.getProximo();
        for (int i = 0; i < pos2; i++) no2 = no2.getProximo();

        NoDuplo ant1 = no1.getAnterior();
        NoDuplo prox1 = no1.getProximo();

        NoDuplo ant2 = no2.getAnterior();
        NoDuplo prox2 = no2.getProximo();

        // Caso especial: adjacentes
        if (no1.getProximo() == no2) {

            if (ant1 != null) ant1.setProximo(no2);
            else head = no2;

            if (prox2 != null) prox2.setAnterior(no1);
            else ultimo = no1;

            no2.setAnterior(ant1);
            no1.setProximo(prox2);

            no2.setProximo(no1);
            no1.setAnterior(no2);

        } else {
            // ligar no1 no lugar de no2
            if (ant2 != null) ant2.setProximo(no1);
            else head = no1;

            if (prox2 != null) prox2.setAnterior(no1);
            else ultimo = no1;

            // ligar no2 no lugar de no1
            if (ant1 != null) ant1.setProximo(no2);
            else head = no2;

            if (prox1 != null) prox1.setAnterior(no2);
            else ultimo = no2;

            // trocar ponteiros internos
            no1.setAnterior(ant2);
            no1.setProximo(prox2);

            no2.setAnterior(ant1);
            no2.setProximo(prox1);
        }
    }

    public void exibir() {
        NoDuplo atual = head;
        System.out.print(head.anterior + " - ");

        while (atual != null) {
            System.out.print(atual.getValor() + " - ");
            atual = atual.getProximo();
        }
        System.out.println("null");
    }
}
