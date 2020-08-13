import java.io.IOException;
import java.util.HashMap;

public class RansomNote {

    
    static void checkMagazine(String[] magazine, String[] note) {

        String canItBeDone = "Yes";

        HashMap <String, Integer> hashTable = new HashMap<>();

        for (int i = 0; i < magazine.length; i++){
            if( hashTable.get(magazine[i]) != null){
                int count = hashTable.get(magazine[i]) + 1;
                hashTable.put(magazine[i], count);
            } else {
                hashTable.put(magazine[i], 1);
            }     
        }

        for (int i = 0; i < note.length; i++){
            if(hashTable.get(note[i]) == null){
                canItBeDone = "No";
            } 

            if(hashTable.get(note[i]) != null && hashTable.get(note[i]) >= 1){
              int count = hashTable.get(note[i]) - 1;
              hashTable.put(note[i], count);
            } else {
                canItBeDone = "No";
            }
        }
        
        System.out.println(canItBeDone);  
        
    }

    public static void main(String[] args) throws IOException {

        String[] magazine = {"two", "times", "three", "is", "not", "four"};
        
        String[] note = {"two", "times", "two", "is", "four"};

        checkMagazine(magazine, note);

    }
}