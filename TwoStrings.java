import java.io.IOException;
import java.util.HashMap;

public class TwoStrings {
    
    static String twoStrings(String s1, String s2) {

        String[] sArray1 = s1.split("");
        String[] sArray2 = s2.split("");

        HashMap <String, Integer> sTable1 = new HashMap<>();

        for (int i = 0; i < sArray1.length; i++){
            sTable1.put(sArray1[i], i);
        }

        for (int i = 0; i < sArray2.length; i++){
            if(sTable1.get(sArray2[i]) != null){
                return "YES";
            }
        }


        return "NO";

    }
    
    public static void main(String[] args) throws IOException {

        String s1 = "Hello";
        
        String s2 = "world";

        System.out.println(twoStrings(s1, s2));

    }
}