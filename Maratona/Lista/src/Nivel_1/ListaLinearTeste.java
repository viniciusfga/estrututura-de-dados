package Nivel_1;

public class ListaLinearTeste {

    public static void main(String[] args) throws Exception {

        ListaLinear lista = new ListaLinear(5);

        lista.inserirFim(3);
        lista.inserirFim(2);
        lista.inserirFim(7);
        lista.inserirFim(2);
        lista.inserirFim(5);

        System.out.println(lista.buscar(7));

    }
}
