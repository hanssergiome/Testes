package teste;

import java.util.Scanner;

public class ReverseString {

	
	public class Solution {
	    public static void main(String[] args) {
	        /* Read input */
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        
	        
	        /* Reverse string and compare to original */
	        String reversed = new StringBuilder(str).reverse().toString();
	        System.out.println(str.equals(reversed) ? "Yes" : "No");
	        sc.close();
	    }
	
}
}