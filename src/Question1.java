import java.util.Arrays;

public class Question1 {
    public static void reverse(int[] arr,int len){
        int temp;
        for (int i = 0,j= arr.length-1; i < j; i++,j--) {
            temp =arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
