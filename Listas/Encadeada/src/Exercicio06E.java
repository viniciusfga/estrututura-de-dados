
/*
    Criar método trocar(int i, int j).
        Verificar se a lista está vazia
        Verificar se as posições i e j são válidas
        Se i == j não precisa trocar
        Percorrer a lista até encontrar o nó da posição i
        Percorrer a lista até encontrar o nó da posição j
        Guardar o valor do nó i em uma variável temporária
        Colocar o valor do nó j no nó i
        Colocar o valor temporário no nó j
        Retornar true indicando que a troca foi realizada
        Caso alguma posição seja inválida, retornar false
*/

public class Exercicio06E {

    public boolean trocar(int i, int j) {

        Nodo lista = new Nodo();

        if (lista.primeiro == null) return false;
        if (i < 0 || j < 0) return false;
        if (i == j) return true;

        Nodo.No atual = lista.primeiro;
        Nodo.No noI = null;
        Nodo.No noJ = null;

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

    public static void main(String[] args) {

        Nodo lista = new Nodo();
        Exercicio06E troca = new Exercicio06E();

        lista.inserirInicio(2);
        lista.inserirInicio(3);
        lista.inserirInicio(4);

        lista.imprimir();

        troca.trocar(0, 2);

        System.out.println();

        lista.imprimir();
    }
}