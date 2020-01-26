


class ReverseSolution {

    public static void main(String[] args){
        int x = -123;
        reverse(x);
    }
    public static int reverse(int x) {
        String[] sNums = Integer.toString(x).split("");
        String reverseString = "";
        int reverseInt = 0;
        
        if(sNums[0].equals("-")){
            reverseString = "-";
            for(int i = sNums.length - 1; i >= 1; i-- ){
                reverseString +=  sNums[i];
            }
            System.out.println(reverseString); 
            reverseInt = Integer.parseInt(reverseString);
            return reverseInt; 
        } else {
            for(int i = sNums.length - 1; i >= 0; i-- ){
                reverseString +=  sNums[i];
            }
            System.out.println(reverseString); 
            reverseInt = Integer.parseInt(reverseString);
            return reverseInt;
        }
    }
}