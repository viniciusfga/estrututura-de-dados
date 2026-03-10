

public class Nodo {

    class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    No primeiro = null;

    public void inserirInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = primeiro;
        primeiro = novo;
    }

    public void imprimir() {
        for (No temp = primeiro; temp != null; temp = temp.proximo) {
            System.out.print("[" + temp.valor + "] > ");
        }
        System.out.println("null");
    }
}
