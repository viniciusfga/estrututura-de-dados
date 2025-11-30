import java.util.Arrays;

public class JavaUtil {

    public static void main(String[] args) {

        // Matrizes de exemplo
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{1, 2}, {3, 4}};

        // Ele entra dentro da matriz e compara elemento por elemento.
        System.out.println("deepEquals(A, B): " + Arrays.deepEquals(A, B));
        System.out.println("equals(A[0], B[0]): " + Arrays.equals(A[0], B[0]));

        int[] v = new int[5];
        Arrays.fill(v, 7);  // [7, 7, 7, 7, 7]

        int[] a = {1, 2, 3};
        int[] b = Arrays.copyOf(a, 5); // [1, 2, 3, 0, 0]

        int[] c = {10, 20, 30, 40};
        int[] d = Arrays.copyOfRange(a, 1, 3); // [20, 30]

        int[] e = {1, 2, 3};
        System.out.println(Arrays.toString(a)); // [1, 2, 3]

        int[] f = {3, 1, 4};
        Arrays.sort(a); // [1, 3, 4]

        int[] g = {1, 3, 5, 7};
        int pos = Arrays.binarySearch(a, 5); // 2





    }
}
