package Lambdas;

public class CalculoTeste {

    public static void main(String[] args) {

        Calculo soma = new Somar();
        Calculo multiplicar = new Multiplicar();

        System.out.println(soma.executar(3, 2));
        System.out.println(multiplicar.executar(3, 2));

    }
}
