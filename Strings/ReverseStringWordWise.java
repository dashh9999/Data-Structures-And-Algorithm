import java.util.*;
import java.lang.*;
import java.io.*;
class ReverseStringWordWise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

class Solution 
{
    public String reverseWords(String s)
    {
        // your code here
      String [] arr=s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
            {
                sb.append(arr[i]);
               
                    sb.append(" ");
            }
        return sb.toString();
    }
}