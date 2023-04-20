import java.util.*;

public class CheckArrayPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
       
        System.out.println(isPalindrome(arr, 0, n-1));
    }

    // Array is palindromic or not 
    public static boolean isPalindrome(int[] arr, int begin, int end) {
        
        if(begin == end) // 5>=5 
        {
            // begin == end then both point to the same element 
            return true;
        }
        
        if(begin > end) // 6>=5
        {
            // begin > end then array is finished no need to compare all other elements are equal 
            return true;
        }
        
        if(arr[begin] != arr[end]) // array will never be palindromic 
        {
            return false;
        }
        else // equal 
        {
            // check remaining part of the array 
            return isPalindrome(arr, begin+1, end-1);
        }
    }
}

