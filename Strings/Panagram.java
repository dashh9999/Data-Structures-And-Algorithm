import java.util.*;
import java.lang.*;
import java.io.*;

public class Panagram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc=new Scanner(System.in);
                String s= sc.nextLine();
                s=s.toLowerCase();
                boolean []check=new boolean[26];
                for(int i=0;i<s.length();i++)
                        {
                                char c=s.charAt(i);
                                if(c!= ' ')
                                {
                                        int idx= c-'a';
                                        check[idx]=true;                                     
                                }
                               
                        }
                   for(int i=0;i<check.length;i++)
                           {
                                   if(check[i]== false)
                                   {
                                           System.out.println("not pangram");
                                           return;
                                   }
                           }
                
                   System.out.println("pangram");              
	}
}