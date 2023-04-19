import java.util.*;
import java.io.*;

class Solution{
	static void quickSort(int[] arr){
        //Write code here
		qs(arr,0,arr.length-1);
			
    }
	static void qs(int arr[],int l,int r){
		if(l<r)
		{
			int pIndex = partition(arr,l,r);
			// l....PIndex-1
			// pIndex+1...r
			qs(arr,l,pIndex-1);
			qs(arr,pIndex+1,r);
		}

	}
	static int partition(int arr[],int l,int r){
		int pivot=arr[r];
		int i=l;
		for(int j=l;j<=r;j++)
			{
				if(arr[j]<pivot)
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					i++;
				}
				
				
			}
		arr[r]=arr[i];
				arr[i]=pivot;
				return i;
	}
}

	


public class QuickSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
		Obj.quickSort(arr);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
 }
