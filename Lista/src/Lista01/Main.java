package Lista01;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista l = new Lista(10);

        System.out.println("Está vazia? " + l.vazia());

        try {
            while (true) {
                System.out.println("Adicione elementos: ");
                l.insere(sc.nextLine());
                l.imprimir();
            }
        } catch (Exception e) {
            System.out.println("Programa encerrado: " + e.getMessage());
        }

        sc.close();

    }
}
