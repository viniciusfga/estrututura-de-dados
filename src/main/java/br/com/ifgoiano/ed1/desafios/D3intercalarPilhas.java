package br.com.ifgoiano.ed1.desafios;

/*
   Crie um método intercalarPilhas(Pilha a, Pilha b) que retorne uma terceira Pilha (Pilha c).
   A Pilha C deve ser formada alternando os elementos de A e B (Um de A, um e B, um e A...),
 */


import br.com.ifgoiano.ed1.estruturas.pilha.Pilha;

public class D3intercalarPilhas {

    public static Pilha intercalar(Pilha a, Pilha b) throws Exception {
        int na = a.tamanho();
        int nb = b.tamanho();
        int[] elemsA = new int[na];
        int[] elemsB = new int[nb];

        for (int i = na - 1; i >= 0; i--) {
            elemsA[i] = a.desempilhar();
        }
        for (int i = nb - 1; i >= 0; i--) {
            elemsB[i] = b.desempilhar();
        }

        int ia = 0;
        int ib = 0;
        int[] intercalado = new int[na + nb];
        int k = 0;

        while (ia < na || ib < nb) {
            if (ia < na) {
                intercalado[k++] = elemsA[ia++];
            }
            if (ib < nb) {
                intercalado[k++] = elemsB[ib++];
            }
        }

        Pilha c = new Pilha(na + nb);
        for (int i = k - 1; i >= 0; i--) {
            c.empilhar(intercalado[i]);
        }

        return c;
    }

    public static void main(String[] args) throws Exception {

        Pilha pilhaA = new Pilha(4);
        Pilha pilhaB = new Pilha(4);

        pilhaA.empilhar(1);
        pilhaA.empilhar(3);

        pilhaB.empilhar(2);
        pilhaB.empilhar(4);
        pilhaB.empilhar(5);

        Pilha pilhaC = intercalar(pilhaA, pilhaB);
        pilhaC.imprimir();
    }
}
