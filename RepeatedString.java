class RepeatedString {

    static long count(String s, long n) {
        long numOfS = n/s.length();
        long rest = n % s.length();
        
        if(!s.contains("a")) return 0;

        return s.length()>n? aCounter(s, rest) 
                : numOfS * aCounter(s, s.length()) + aCounter(s, rest);
    }
    
    private static long aCounter(String s, long end) {
        int a=0;
        for (int i = 0; i < end; i++) {
            if (s.charAt(i) == 'a') a++;
        }
        return a;
    }

    public static void main(final String[] args) {
        final String s = "a";
        final long n = 100000000000L;

       long showMe = count(s, n);
       System.out.println(showMe);
    }
}