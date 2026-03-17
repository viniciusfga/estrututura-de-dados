package ListaDuplaEncadeada;

public class NoDuplo {

    int valor;
    NoDuplo proximo;
    NoDuplo anterior;

    public NoDuplo(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "NoDuplo valor = " + valor;
    }
}
