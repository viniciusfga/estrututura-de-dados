package Estatico;

public class Foreach {

    public static void main(String[] args) {

        double[] notas = {1.3,4.1,3.1,4.3};

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] +  " ");
        }

        System.out.println();

        for(double nota : notas){
            System.out.print(nota + " ");
        }   


    }
}
