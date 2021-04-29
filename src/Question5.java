import java.util.Arrays;

public class Question5 {
    //seprate negative at left side in an array
    static void seprate(int[] arr){
        int j = -1;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                j++;
                temp  = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr  ={1,2,-3,0,2,4,4,-4,-6};
        seprate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
