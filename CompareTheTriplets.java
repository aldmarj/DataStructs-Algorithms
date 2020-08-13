import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> score = Arrays.asList(0,0);

        for (int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                score.set(0, (score.get(0) + 1));
            } else if( a.get(i) < b.get(i)){
                score.set(1, (score.get(1) + 1));
            }
        }

        return score;

    }

    public static void main(String[] args) throws IOException {

        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(3, 2, 1);

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result);
    
    }
}