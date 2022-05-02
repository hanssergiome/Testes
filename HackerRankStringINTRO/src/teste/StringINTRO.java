package teste;

import java.util.Scanner;

public class StringINTRO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();

		System.out.println(a.length() + b.length());
		System.out.println((b.compareTo(b) > 0) ? "Yes" : "No");
		System.out.println(

				a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase()
						+ b.substring(1));
	}
}
