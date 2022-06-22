package teste;

import java.util.Scanner;

public class ReverseString {

	public class Solution {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();

			String reversed = new StringBuilder(str).reverse().toString();
			System.out.println(str.equals(reversed) ? "Yes" : "No");
			sc.close();
		}

	}
}