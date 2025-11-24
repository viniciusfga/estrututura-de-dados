import javax.print.attribute.SetOfIntegerSyntax;
import java.util.*;

public class P12 {

    /*
    Escreva um programa executável em Java que escreva a mesma frase **100 vezes**:
    “Eu não mandarei mais spam para meus amigos.”

    O programa deve:
        - numerar as frases;
        - “acidentalmente” **fazer oito erros aleatórios diferentes de digitação**.
     */

    public static void main(String[] args) {

        String fraseCorreta = "Eu não mandarei mais spam para meus amigos.";
        int totalLinhas = 100;

        Set<Integer> linhasComErro = new HashSet<>();

        Random rand = new Random();

        while (linhasComErro.size() < 8) {
            linhasComErro.add(rand.nextInt(totalLinhas) + 1);
        }

        // Lista de possíveis erros de digitação
        String[] erros = {
                "Eu nao mandarei mais spam para meus amigos",   // tira acento e ponto
                "Eu não mandare mais spam para meus amigos.",  // falta 'i'
                "Eu não mandarei mais span para meus amigos.", // troca de letra
                "Eu não mandarei mas spam para meus amigos.",  // troca mais/mas
                "Eu não mandarei mais spam pr meus amigos.",   // falta letra
                "Eu n mandarei mais spam para meus amigos.",   // falta letra no início
                "Eu não mandarei mais spam para meus amigo.",  // plural errado
                "Eu nã mandarei mais spam para meus amigos."   // erro aleatório de acento
        };

        Iterator<String> errosIterator = Arrays.asList(erros).iterator();

        for (int i = 1; i <= totalLinhas; i++) {

            String linha = fraseCorreta;
            // Se esta linha deve ter erro
            if (linhasComErro.contains(i) && errosIterator.hasNext()) {
                linha = errosIterator.next();
            }

            System.out.println(i + ": " + linha);


        }


    }
}
