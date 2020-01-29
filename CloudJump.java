class CloudJump {

    static int jumpingOnClouds(int[] c) {
        int numJumps = c.length - 1;
        System.out.println(numJumps);


        for(int i = 0; i < c.length; i++){
            if(i + 2 <= c.length){
                if(c[i] == 1 ){
                    numJumps -= 0;
                } 
                if(c[i] == 0 && c[i + 2] == 0){
                    i++;
                    numJumps -= 1;
                } 
                if(c[i] == 0 && c[i + 2] == 1){
                    numJumps -= 0;
                }  
            } else {
                numJumps -= 0;
            }
        }

        System.out.println(numJumps);

        return numJumps;
    }


    public static void main(String[] args){
        int[] c = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0};
        jumpingOnClouds(c);

    }
}