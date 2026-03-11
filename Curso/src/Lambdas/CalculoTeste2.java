package Lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {

        //  Lambda: forma curta e simplificada de escrever funções anônimas
        Calculo calculo = (x, y) -> x + y;

        System.out.println(calculo.executar(3, 2));

        calculo = (x, y) -> {
            return x * y;
        };

        System.out.println(calculo.executar(3, 2));
    }
}
