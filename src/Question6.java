import java.util.Arrays;

public class Question6 {
    static int[] union(int[] a,int[] b){
        int n = a.length;
        int m = b.length;
        int g = n>m?n:m;
        int[] c = new int[n+m];
        Arrays.sort(a);  // 2,2,3,4,5
        Arrays.sort(b);   // 2,5,7
        int i,j,k;
        i=j=k=0;
        while(i<n && j <m){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }
            else if(a[i]>b[j]){
                c[k++] = b[j++];
            }
            else{
                if(k==0){
                    c[k++]=a[i++];
                    j++;
                }
                else if(a[k-1]==a[i]){
                    i++;
                    j++;
                }
                else{
                    c[k++]=a[i++];
                    j++;
                }
            }
        }
        while(i<n){
            c[k++] = a[i++];
        }
        while (j<m){
            c[k++]=b[j++];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5},b={2,5,7};
        System.out.println(Arrays.toString(union(a, b)));
    }
}
