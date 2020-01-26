import java.util.ArrayList;
import java.util.List;

class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        List<Integer> reverseIntList =new ArrayList<Integer>();
        int counter = x;
        int reverseInt = 0;
    

        while (counter > 0) {
            reverseIntList.add(counter % 10);
            counter = counter / 10;
        }

        for (int a : reverseIntList) {
            reverseInt = 10 * reverseInt + a;
        }

        

        if(x == reverseInt){
            System.out.println(reverseInt);
            System.out.println("true");
            return true;
            
        } else {
            System.out.println(reverseInt);
            System.out.println("false");
            return false;
            
        }
    }

    public static void main(String[] args){
        int number = 121;

        isPalindrome(number);
    }
}