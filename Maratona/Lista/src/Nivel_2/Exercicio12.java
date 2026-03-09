package Nivel_2;

import java.util.Arrays;

//Criar método redimensionar() que dobra a capacidade do array.
public class Exercicio12 {

    public static class Lista {

        int[] elementos;
        int tamanho;

        public Lista(int capacidade){
            elementos = new int[capacidade];
            tamanho = 0;
        }

        private void redimencionar(){

            int novaCapacidade = elementos.length * 2;

            int[] novoArray = new int[novaCapacidade];

            //copia elementos
            for (int i = 0; i < tamanho; i++) {
                novoArray[i] = elementos[i];
            }

            elementos = novoArray;
        }

        public void adiciona(int elemento) throws Exception {
            if (tamanho == elementos.length) {
                throw  new Exception("Lista Cheia!");
            }

            elementos[tamanho] = elemento;
            tamanho++;
        }

        public String toString(){
            return Arrays.toString(elementos);
        }
    }

    public static void main(String[] args) throws Exception {

        Lista lista = new Lista(3);

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println(lista);

        lista.redimencionar();

        System.out.println("Adiciona");
        lista.adiciona(+ 4);

        System.out.println(lista.tamanho);
        System.out.println(lista);
        
    }

}
