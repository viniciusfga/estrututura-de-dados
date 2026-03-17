package ListaDuplaEncadeada;

public class Teste {

    public static void main(String[] args) {

        ListaDupla minhaLista = new ListaDupla();

        // 2. Inserir valores no fim
        System.out.println("Inserindo valores...");
        minhaLista.insereFim(10);
        minhaLista.insereFim(20);
        minhaLista.insereFim(30);

        // 3. Exibir a lista para conferir
        System.out.print("Estado atual da lista: ");
        minhaLista.exibir();

    }
}
