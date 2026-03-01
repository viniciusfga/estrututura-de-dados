package Exercicio03;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(){
        elementos = new String[100];
        tamanho = 0;
    }

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    public boolean adiciona(String elemento){

        if (tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return  true;
        }
        return false;
    }




}
