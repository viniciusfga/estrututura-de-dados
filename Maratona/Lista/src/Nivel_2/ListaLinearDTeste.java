package Nivel_2;

public class ListaLinearDTeste {

    public static void main(String[] args) {

        ListaLinearD lista = new ListaLinearD(5);

        lista.inserirFim(1);
        lista.inserirFim(3);
        lista.inserirFim(2);
        lista.inserirFim(4);
        lista.inserirFim(5);

        System.out.println(lista.capacidade());

        lista.inserirFim(5);

        System.out.println(lista.capacidade());

        System.out.println(lista);
    }
}
