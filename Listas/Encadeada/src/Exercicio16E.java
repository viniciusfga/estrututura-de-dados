
/*
    Escreva um método que inverte a ordem das células de uma lista
    encadeada (a primeira passa a ser última, segunda passa a ser penúltima etc.). Faça isso
    sem usar espaço auxiliar; apenas altere os ponteiros.
*/

public class Exercicio16E {

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


    public static void main(String[] args) {

        Exercicio16E lista = new Exercicio16E();
    }

}
