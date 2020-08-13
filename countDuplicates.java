import java.util.Arrays;

class CountDuplicates {

    public static int countDuplicates(int[] nums) {
       
       int counter = 0;

       for( int i = 0; i < nums.length; i++){
           for( int j=i+1; i < nums.length; j++)
                if(nums[i] == nums[j]){
                    counter++;
                }
       }

       return counter;
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,1,2,2,2,2,3,3,4};

        System.out.println("nums before check:  " + Arrays.toString(nums));

        int duplicates = countDuplicates(nums);

        System.out.println("nums after check:  " + duplicates);

    }

}