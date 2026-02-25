package Lista;

public class Lista {

    private Object[] item;
    private int primeiro;
    private int ultimo;

    public Lista(int max) {
        this.item = new Object[max];
        this.primeiro = 0;
        this.ultimo = 0;
    }

    public boolean vazia() {
        return (this.primeiro == this.ultimo);
    }

    public void insereFim(Object valor) throws Exception {
        if (ultimo >= item.length)
            throw new Exception("Erro : A lista esta cheia");

        item[ultimo] = valor;
        ultimo = ultimo + 1;
    }

    public void insereInicio(Object valor) throws Exception {
        if (ultimo >= item.length)
            throw new Exception("Erro : A lista esta cheia");

        for (int i = ultimo - 1; i >= primeiro; i--) {
            item[i + 1] = item[i];
        }
        item[primeiro] = valor;
        ultimo = ultimo + 1;
    }

    public Object pesquisa(Object valor) {
        if (vazia() || valor == null)
            return null;
        for (int p = 0; p < ultimo; p++)
            if (item[p].equals(valor))
                return item[p];
        return null;

    }

    public Object retira(Object valor) throws Exception {

        if (vazia())
            throw new Exception("Erro: Lista vazia");

        int pos = -1;

        for (int i = primeiro; i < ultimo; i++) {
            if (item[i].equals(valor)) {
                pos = i;
                break;
            }
        }

        if (pos == -1)
            return null;

        Object removido = item[pos];

        for (int i = pos; i < ultimo - 1; i++) {
            item[i] = item[i + 1];
        }

        ultimo--;

        return removido;
    }

    public void imprimir() {
        for (int k = primeiro; k < item.length - 1; k++)
            System.out.print("["+ item[k] + "] ");

        System.out.println();
    }
}
