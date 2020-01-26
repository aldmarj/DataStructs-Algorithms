/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice. 

To optimise use a hash map.*/

import java.util.Arrays;

class Solution {
     
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    int[] solution = { i, j};
                    System.out.println(Arrays.toString(solution));
                    return solution;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}