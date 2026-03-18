package ListaChar;

class StringLista {
    NodoChar head;

    StringLista() {
        this.head = null;
    }

    MetodosSimples metodosSimples;

    public static StringLista strcreate(String str) {
        StringLista lista = new StringLista();
        for (int i = 0; i < str.length(); i++) {
            lista.metodosSimples.inserirFim(str.charAt(i));
        }
        return lista;
    }

    public static String strcnvlc(StringLista lista) {
        StringBuilder sb = new StringBuilder();
        NodoChar atual = lista.head;
        while (atual != null) {
            sb.append(atual.valor);
            atual = atual.prox;
        }
        return sb.toString();
    }

    public static int strvrfyl(StringLista l1, StringLista l2) {
        NodoChar atual1 = l1.head;
        int pos = 0;
        while (atual1 != null) {
            boolean encontrado = false;
            NodoChar atual2 = l2.head;
            while (atual2 != null) {
                if (atual1.valor == atual2.valor) {
                    encontrado = true;
                    break;
                }
                atual2 = atual2.prox;
            }
            if (!encontrado) {
                return pos;
            }
            atual1 = atual1.prox;
            pos++;
        }
        return -1; // todos os caracteres estão contidos
    }

    public static StringLista strsbstr(StringLista l1, int i1, int i2) {
        StringLista sub = new StringLista();
        NodoChar atual = l1.head;
        int pos = 0;
        while (atual != null) {
            if (pos >= i1 && pos <= i2) {
                sub.metodosSimples.inserirFim(atual.valor);
            }
            atual = atual.prox;
            pos++;
        }
        return sub;
    }

    public static void strpsblill(StringLista l1, int i1, int i2, StringLista l2) {
        NodoChar atualL1 = l1.head;
        NodoChar atualL2 = l2.head;
        int pos = 0;

        while (atualL1 != null && atualL2 != null && pos <= i2) {
            if (pos >= i1) {
                atualL1.valor = atualL2.valor;
                atualL2 = atualL2.prox;
            }
            atualL1 = atualL1.prox;
            pos++;
        }
    }

    public static int strcmpl(StringLista l1, StringLista l2) {
        NodoChar p1 = l1.head;
        NodoChar p2 = l2.head;

        while (p1 != null && p2 != null) {
            if (p1.valor < p2.valor) return -1;
            if (p1.valor > p2.valor) return 1;
            p1 = p1.prox;
            p2 = p2.prox;
        }

        // Se chegou ao fim de uma das listas
        if (p1 == null && p2 == null) return 0; // iguais
        if (p1 == null) return -1; // l1 menor
        return 1; // l1 maior
    }
}