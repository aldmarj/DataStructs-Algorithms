import java.util.Arrays;

class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
       int index = 1;
       int counter = 0;

       for( int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                nums[index++] = nums[i + 1];
                counter++;
            }
       }

       return index;
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,1,2,2,2,2,3,3,4};

        System.out.println("nums before check:  " + Arrays.toString(nums));

        int length = removeDuplicates(nums);

        System.out.println("nums after check:  " + Arrays.toString(nums));

        for(int i = 0; i < length; i++){
            System.out.println(nums[i]);
        }
    }

}