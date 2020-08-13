import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class SherlockAnagrams {
    static int sherlockAndAnagrams(String s) {
        String[] inputArray = s.split("");
        
        HashMap <String, Integer> sherlockTable = new HashMap<>();

        for ( int i = 0; i < s.length(); i++){
            for ( int j = i; j < s.length(); j++){
                char[] c = s.substring(i, j + 1).toCharArray();
                Arrays.sort(c);
                String k = new String(c);

                if(sherlockTable.get(k) != null){
                    sherlockTable.put(k, sherlockTable.get(k) + 1);
                } else {
                    sherlockTable.put(k, 1);
                }
            }
        }
        
        int annagramCount = 0;

        for(String k: sherlockTable.keySet()){
            int pairs = sherlockTable.get(k);
            annagramCount += (pairs * (pairs - 1)/2);
        }

        return annagramCount;
    }
    
    public static void main(String[] args) throws IOException {

        String s1 = "abba";

        System.out.println(sherlockAndAnagrams(s1));

    }
}