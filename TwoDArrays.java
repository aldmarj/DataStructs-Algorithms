import java.util.ArrayList;
import java.util.List;

class TwoDArrays {
    static int hourglassSum(int[][] arr) {

        int largestSum = 0;
        List<Integer> sumsArr = new ArrayList<Integer>();

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                sumsArr.add(arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                                        arr[i + 1][j + 1]  +
                            arr[i + 2][j] + arr[i+2][j + 1] + arr[i+2][j+2] 
                        );
            } 
        }

        largestSum = sumsArr.get(0);
        for(int i = 0; i < sumsArr.size(); i++){ 
            if(largestSum < sumsArr.get(i)){
                largestSum = sumsArr.get(i);
            }
        }

        System.out.println(sumsArr);
        System.out.println(largestSum);

        return largestSum;
    }

                        // {1,1,1,0,0,0},
                        // {0,1,0,0,0,0},
                        // {1,1,1,0,0,0},
                        // {0,0,2,4,4,0},
                        // {0,0,0,2,0,0},
                        // {0,0,1,2,3,0}

    public static void main(String[] args){

       int[][] arr = {  {0, -4, -6, 0, -7, -6},
                        {-1, -2, -6, -8, -3, -1},
                        {-8, -4, -2, -8, -8, -6},
                        {-3, -1, -2, -5, -7, -4},
                        {-3, -5, -3, -6, -6, -6},
                        {-3, -6, 0, -8, -6, -7}
                    };

        hourglassSum(arr);

    }
}