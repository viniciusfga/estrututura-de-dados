package exercicios.lista04.ListaChar.Encadeada;

class NoChar {

    char caractere;
    NoChar prox;

    NoChar(char valor) {
        this.caractere = valor;
        this.prox = null;
    }
}

public class ListaStringManipulator {


    public static NoChar strcreate(char[] str) {
        if (str == null || str.length == 0) {
            return null;
        }

        NoChar cabecalho = new NoChar(str[0]);
        NoChar atual = cabecalho;

        for (int i = 1; i < str.length; i++) {
            NoChar novoNo = new NoChar(str[i]);
            atual.prox = novoNo;
            atual = novoNo;
        }

        return cabecalho;
    }

    public static void imprimirLista(NoChar head) {
        NoChar atual = head;
        while (atual != null) {
            System.out.print(atual.caractere + " -> ");
            atual = atual.prox;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'C', 'D'};

        // Chamada do método solicitado
        NoChar lista = strcreate(charArray);

        System.out.print("Generics.Lista criada: ");
        imprimirLista(lista);
    }
}