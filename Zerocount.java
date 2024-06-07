import java.util.Scanner;

public class Zerocount {

    public static int placementlelo(int L, int K) {
        if (K == 0) {
            return L;
        }
        if (K == L) {
            return 0;
        }
        int maxZeros = 0;
        if (K > 0) {
            maxZeros = 1;
        }
        return maxZeros;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int K = sc.nextInt();
        int result = placementlelo(L, K);
        System.out.print(result);
    }
}
