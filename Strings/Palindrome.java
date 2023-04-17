import java.util.*;
import java.lang.*;
import java.io.*;

public class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                  Scanner sc=new Scanner(System.in);            
                String s=sc.nextLine();
                s=s.toLowerCase();
            StringBuilder sb=new StringBuilder();
                for(int i=0;i<s.length();i++)
                        {
                                char c=s.charAt(i);
                                if((c>='a' && c<='z') || (c>='0' && c<='9'))
                                
                                        sb.append(c);
                                
                        }
                s=sb.toString();
                int f=0;
                int l=s.length()-1;
                while(f<l)
                {
                  if(s.charAt(f)!=s.charAt(l))
                  {
                          System.out.println(0);
                          return;
                  }
                        f++;
                        l--;
                }
                   System.out.println(1);
	}
}