class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        String longestPrefix = "";

        for(int i = 0; i < strs.length; i++){
            String[] strsSplit = strs[i].split("");

            for(int j = i + 1; j < strs.length; j++){
                if(strs[i].contains(strs[j])){
                    longestPrefix = strs[i];
                } else {
                    for(int k = strsSplit.length; k >= 0; k--){
                        

                    }

                }
            }
        }

        return "true";
        
    }

    public static void main(String[] args){
        String[] words = {"flower", "flight", "fly"};

        longestCommonPrefix(words);
    }
}