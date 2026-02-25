package Lista;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lista l = new Lista(10);

        int opcao = 0;
        do {
            System.out.println("\n--- SISTEMA LISTA ESTÁTICA ---");
            System.out.println("1 - Inserir no Fim");
            System.out.println("2 - Inserir no Início");
            System.out.println("3 - Pesquisar Elemento");
            System.out.println("4 - Remover Elemento");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            try {

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1 -> l.insereFim(sc.nextLine());
                    case 2 -> l.insereInicio(sc.nextLine());
                    case 3 -> System.out.println(l.pesquisa(sc.nextLine()));
                    case 4 -> l.retira(sc.nextLine());
                    case 5 -> System.out.println("Saindo...");
                    default -> System.out.println("Inválido");
                }

                System.out.print("Lista atual: ");
                l.imprimir();

            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números!");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Erro na operação: " + e.getMessage());
            }
        } while (opcao != 5);

        sc.close();
    }
}
