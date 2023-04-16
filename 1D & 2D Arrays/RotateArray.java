import java.util.*;

public class RotateArray {
    public static void main(String[] args) throws Throwable {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        // Initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // No. of times to rotate
        rotateArray(arr, n, k);
    }

    public static void rotateArray(int arr[], int n, int k) {
        // Write code here
		int i=0;
		int j=k-1;
		int m=arr.length-1;
		int a=n-1;
		while(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
	  while(k<m)
			{
				int temp=arr[k];
				arr[k]=arr[m];
				arr[m]=temp;
				k++;
				m--;
			}
		int start=0;
		int end =arr.length-1;
		 while(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		
		for(int p=0;p<arr.length;p++)
			{
				System.out.print(arr[p]+" ");
			}
    }

}