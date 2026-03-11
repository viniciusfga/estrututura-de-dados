class CharNo {
    char valor;
    CharNo proximo;

    CharNo(char valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class StringLista {
    CharNo cabeca; // nó de cabeçalho (pode ser null se lista vazia)

    StringLista() {
        this.cabeca = null;
    }

    // Inserir no fim
    public void inserirFim(char c) {
        CharNo novo = new CharNo(c);
        if (cabeca == null) {
            cabeca = novo;
            return;
        }
        CharNo atual = cabeca;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = novo;
    }

    // Imprimir lista (apenas para debug)
    public void imprimir() {
        CharNo atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor);
            atual = atual.proximo;
        }
        System.out.println();
    }

    public static StringLista strcreate(String str) {
        StringLista lista = new StringLista();
        for (int i = 0; i < str.length(); i++) {
            lista.inserirFim(str.charAt(i));
        }
        return lista;
    }

    public static String strcnvlc(StringLista lista) {
        StringBuilder sb = new StringBuilder();
        CharNo atual = lista.cabeca;
        while (atual != null) {
            sb.append(atual.valor);
            atual = atual.proximo;
        }
        return sb.toString();
    }

    public static int strvrfyl(StringLista l1, StringLista l2) {
        CharNo atual1 = l1.cabeca;
        int pos = 0;
        while (atual1 != null) {
            boolean encontrado = false;
            CharNo atual2 = l2.cabeca;
            while (atual2 != null) {
                if (atual1.valor == atual2.valor) {
                    encontrado = true;
                    break;
                }
                atual2 = atual2.proximo;
            }
            if (!encontrado) {
                return pos;
            }
            atual1 = atual1.proximo;
            pos++;
        }
        return -1; // todos os caracteres estão contidos
    }

    public static StringLista strsbstr(StringLista l1, int i1, int i2) {
        StringLista sub = new StringLista();
        CharNo atual = l1.cabeca;
        int pos = 0;
        while (atual != null) {
            if (pos >= i1 && pos <= i2) {
                sub.inserirFim(atual.valor);
            }
            atual = atual.proximo;
            pos++;
        }
        return sub;
    }

    public static void strpsblill(StringLista l1, int i1, int i2, StringLista l2) {
        CharNo atualL1 = l1.cabeca;
        CharNo atualL2 = l2.cabeca;
        int pos = 0;

        while (atualL1 != null && atualL2 != null && pos <= i2) {
            if (pos >= i1) {
                atualL1.valor = atualL2.valor;
                atualL2 = atualL2.proximo;
            }
            atualL1 = atualL1.proximo;
            pos++;
        }
    }

    public static int strcmpl(StringLista l1, StringLista l2) {
        CharNo p1 = l1.cabeca;
        CharNo p2 = l2.cabeca;

        while (p1 != null && p2 != null) {
            if (p1.valor < p2.valor) return -1;
            if (p1.valor > p2.valor) return 1;
            p1 = p1.proximo;
            p2 = p2.proximo;
        }

        // Se chegou ao fim de uma das listas
        if (p1 == null && p2 == null) return 0; // iguais
        if (p1 == null) return -1; // l1 menor
        return 1; // l1 maior
    }

}