public class Find_Kth_mininmun {
    static int findKthMinimum(int[] arr,int k,int l,int h){

            int pos = partition(arr, l, h);
            if (pos == k - 1) {
                return arr[pos];
            }
            if (pos > k - 1) return findKthMinimum(arr, k, l, pos-1);
            else return findKthMinimum(arr, k,pos+1, h);


    }
    static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int j = low-1;
        int temp;
        for (int i = low; i < high+1 ; i++) {
            if(arr[i]<=pivot){
                j++;
                temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,9};
        System.out.println(findKthMinimum(arr,1,0,arr.length-1));
    }
}
