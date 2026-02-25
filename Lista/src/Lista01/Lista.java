package Lista01;

public class Lista {

    private Object[] item;
    private int primeiro;
    private int ultimo;

    public Lista(int max) {
        this.item = new Object[max];
        this.primeiro = 0;
        this.ultimo = this.primeiro;
    }

    // Método que verifica se o array está vazio
    public boolean vazia() {
        return (this.primeiro == this.ultimo);
    }

    public void insere(String primeiroElemento) throws Exception {

        if (this.ultimo >= this.item.length) {
            throw new Exception("A lista está cheia!");
        } else {
            this.item[this.ultimo] = primeiroElemento;
            this.ultimo++;
        }
    }

    public void imprimir() {
        for (int i = 0; i < this.item.length; i++) {
            if (i < this.ultimo) {
                System.out.print("[" + this.item[i] + "] ");
            } else {
                System.out.print("[ _ ] ");
            }
        }
        System.out.println();
    }

}
