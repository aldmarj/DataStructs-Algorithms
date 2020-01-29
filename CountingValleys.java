class CountingValleys{
    static int countingValleys(int n, String s) {
        int numValley = 0;
        int seaLevel = 0;

        for ( int i = 0; i < n; i++){
            if(s.charAt(i) == 'U') seaLevel++;

            if(s.charAt(i) == 'D') seaLevel--;

            if(s.charAt(i) == 'U' && seaLevel == 0){
                numValley++;
            }
        }
        
        System.out.println(numValley);

      

        return numValley;
    }

    public static void main(String[] args){
        int n = 8;
        String s = "UDDDUDUU";
        countingValleys(n, s);
    }
}