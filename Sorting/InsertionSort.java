import java.util.*;
import java.lang.*;
import java.io.*;

public class InsertionSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
         for(int i=1;i<n;i++)
             {
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp)
            {
               arr[j+1] =arr[j];
                j--;
            }
        arr[j+1]=temp;
             }
          for(int j=0;j<n;j++)
             {
                 System.out.print(arr[j]+" ");
             }
        
	}
}