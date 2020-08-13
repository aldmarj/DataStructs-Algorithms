import java.io.*;
import java.util.*;

public class SimpleArraySum {


    static int simpleArraySum(int[] ar) {
       System.out.println(Arrays.toString(ar));
       int sum = 0;
       
       for( int i = 0; i < ar.length; i++){
            sum += ar[i];
       }
        
       return sum;
    }

    

    public static void main(String[] args) throws IOException {
        

        int[] ar = {1, 2, 3, 4, 10, 11};

        int result = simpleArraySum(ar);

        System.out.println(result);
    }
}