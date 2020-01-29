import java.util.Arrays;

class LeftRotation{

    static int[] rotLeft(int[] a, int d) {
        int aSize = a.length;

        for(int i = 0; i < d; i++){
            performRotation(a, aSize);     
        }

        System.out.println(Arrays.toString(a));
        return a;
    }

    static int[] performRotation(int[] a, int n){
        int i, temp; 
        temp = a[0];

        for(i = 0; i < n - 1; i++){
                a[i] = a[i + 1];     
        }

        a[i] = temp;

        return a;
    }

    public static void main(String[] args){

        int[] a = {1,2,3,4,5};
        int d = 4;

        rotLeft(a, d);

    }
}