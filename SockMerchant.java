import java.io.*;
import java.util.*;


public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Set<Integer> colors = new HashSet<>();
    int pairs = 0;

    for (int i = 0; i < n; i++) {
        if (!colors.contains(ar[i])) {
            colors.add(ar[i]);
        } else {
            pairs++;
            colors.remove(ar[i]);
        }
    }

    System.out.println(pairs);

    return pairs;

    }

    public static void main(String[] args) throws IOException {
        
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(n, ar);

       System.out.println(result);
    }
}