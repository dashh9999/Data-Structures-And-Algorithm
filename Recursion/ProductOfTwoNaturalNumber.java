import java.util.*;

public class ProductOfTwoNaturalNumber {
	static long product(int n){
		//Write code here
		if(n==1)
		{
			return 1;
		}
		
		return (n*product(n-1)); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(product(n));
    }
}