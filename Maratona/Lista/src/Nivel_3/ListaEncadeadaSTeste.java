package Nivel_3;

public class ListaEncadeadaSTeste {

    public static void main(String[] args) {

        ListaLinear lista = new ListaLinear();

        lista.inserirInicio(30);
        lista.inserirInicio(20);
        lista.inserirInicio(10);

        lista.inserirFim(40);
        lista.inserirFim(50);

        lista.imprimir();

        System.out.println(lista.buscar(50));

    }
}
