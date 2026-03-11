package Nivel_2;

import java.util.Arrays;

public class ListaLinearD {

    private int[] elementos;
    private int quantidade;

    public ListaLinearD(int capacidadeInicial) {
        elementos = new int[capacidadeInicial];
        quantidade = 0;
    }

    private void redimensionar() {
        elementos = Arrays.copyOf(elementos, elementos.length  * 2);
    }

    public void inserirFim(int elemento) {

        if (quantidade >= elementos.length) {
            redimensionar();
        }

        elementos[quantidade] = elemento;
        quantidade ++;
    }

    public int capacidade(){
        return elementos.length;
    }

    public boolean estaCheia(){
        return quantidade == elementos.length;
    }

    public boolean estaVazia(){
        return quantidade == 0;
    }

    public void limpar(){
        quantidade = 0;
    }

    @Override
    public String toString() {
        return "Elementos = " + Arrays.toString(Arrays.copyOf(elementos, quantidade));
    }

    public int buscarOrdenado(int valor){
        for (int i = 0; i < quantidade; i++) {

            if (elementos[i] == valor) {
                return i;
            }

            // otimização
            if (elementos[i] > valor) {
                return -1;
            }
        }

        return -1;
    }
}
