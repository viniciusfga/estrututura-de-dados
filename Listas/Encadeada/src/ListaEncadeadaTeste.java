public class ListaEncadeadaTeste {

    public static void main(String[] args) {

        StringLista l1 = StringLista.strcreate("abcde");
        StringLista l2 = StringLista.strcreate("acd");

        l1.imprimir(); // abcde
        l2.imprimir(); // acd

        System.out.println(StringLista.strvrfyl(l1, l2)); // primeira posição que não está em l2 → 1 ('b')

        StringLista sub = StringLista.strsbstr(l1, 1, 3);
        sub.imprimir(); // bcd

        StringLista.strpsblill(l1, 1, 2, StringLista.strcreate("xy"));
        l1.imprimir(); // axyde

        System.out.println(StringLista.strcmpl(l1, l2)); // 1 (porque axyde > acd)

    }
}
