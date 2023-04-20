import java.io.*;
import java.util.Scanner;

public class FindMaximumInArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        int result=maxElement(nums,n);
        System.out.print(result);
    }

    public static int maxElement(int[] arr,int n){
      //Write your code here
		if(n==0)
		{
			return arr[0];
		}
		int firstoption=arr[n-1];
		int secondoption= maxElement( arr,n-1);
		int ans=Math.max(firstoption,secondoption);
		return ans;
    }
}