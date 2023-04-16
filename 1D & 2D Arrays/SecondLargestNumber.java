import java.util.*;
import java.lang.*;
import java.io.*;

public class SecondLargestNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                 Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int [] arr=new int [n];
                for (int i=0;i<n;i++)
                {
                        arr[i]=sc.nextInt();
                }
                int maxx=Integer.MIN_VALUE; 
                int maxx2=Integer.MIN_VALUE; 
                int index=0;
                for(int i=0;i<n;i++)
                        {
                                if(arr[i]>maxx)
                                {
                                   maxx   =  arr[i];
                                        index=i;
                                }
                                }
                                  for(int i=0;i<n;i++)
                                          {
                               if(arr[i]>maxx2 && index!=i)
                                {
                                       maxx2=arr[i];
                                }
                                          }
                        
                System.out.print(maxx2);
	}
}