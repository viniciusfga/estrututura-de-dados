package Colections;

import java.io.IOException;
import java.util.*;

public class ParImpares {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        for (int i : pares) {
            System.out.println(i);
        }

        for (int i : impares) {
            System.out.println(i);
        }

        sc.close();
    }
}