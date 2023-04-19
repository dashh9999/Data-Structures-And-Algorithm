import java.util.*;
import java.lang.*;
import java.io.*;

public class SelectionSort
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
       
        for(int i=0;i<arr.length-1;i++)
            {
                 int s=i;
             for(int j=i+1;j<arr.length;j++)
                 {
                     if(arr[s]>arr[j])
                     {
                        s=j;
                     }                      
                 }
                int temp=arr[s];
                         arr[s]=arr[i];
                         arr[i]=temp;
            }
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
   }
}