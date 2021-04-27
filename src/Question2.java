import java.util.Arrays;

public class Question2 {
    static int[] minmax(int[] arr,int low ,int high){
        int[] minmax = new int[2]; //index 0 catain min index 1 cantain max
        if(low == high){
            minmax[0] = arr[low];
            minmax[1] = arr[low];
            return minmax;
        }
        if(high== low +1){
            if(arr[low]>arr[high]){
                minmax[0] =arr[high];
                minmax[1]  = arr[low];
                return minmax;
            }
            else {
                minmax[1] =arr[high];
                minmax[0]  = arr[low];
                return minmax;
            }
        }
        int[] minmaxleft = new int[2];
        int[] minmaxright  = new int[2];
        int mid = (low+high)/2;
        minmaxleft = minmax(arr,low,mid);
        minmaxright = minmax(arr,mid,high);
        if(minmaxleft[0]<minmaxright[0]) minmax[0] = minmaxleft[0];
        else minmax[0] = minmaxright[0];
        if(minmaxleft[1]>minmaxright[1]) minmax[1] = minmaxleft[1];
        else minmax[1] = minmaxright[1];
        return minmax;
    }
    static int[] minmax(int[] arr){
        return minmax(arr,0, arr.length-1);

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minmax(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));
    }
}
