import java.util.*;
import java.io.*;

class Solution {
static void mergeSort(int[] arr,int l,int r){
     // Your code here
	if(l>=r)
	{return;}
	
		int mid=(l+r)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		merge(arr,l,mid,r);
	
}
	static void merge(int[] arr,int l,int mid,int r)
		{
		  int [] temp=new int[r-l+1];
		int i=l;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=r)
			{
				if(arr[i]<arr[j])
				{
					temp[k]=arr[i];
					i++;
					k++;
				}
				else
				{
					temp[k]=arr[j];
					j++;
					k++;
				}
			}
		while(i<=mid)
			{
				temp[k]=arr[i];
				i++;
				k++;
			}
		while(j<=r)
			{
				temp[k]=arr[j];
				j++;
				k++;
			}
			 k=0;
	for(int p=l;p<=r;p++)
		{
			arr[p]=temp[k];
			k++;
		}
			
		}
        }


public class MergeSort {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        Solution Obj = new Solution();
        Obj.mergeSort(a,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
