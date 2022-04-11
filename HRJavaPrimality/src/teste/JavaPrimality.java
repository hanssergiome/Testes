package teste;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimality {

	public static void main(String[] args) {
		

			
				Scanner sc = new Scanner(System.in);
				BigInteger n = sc.nextBigInteger();
				sc.close();
				if (n.isProbablePrime(1)) {
					System.out.println("primo");
				} else {
					System.out.println("não é primo");
				}
		
		

	}

}
