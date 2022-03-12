import java.util.Scanner;

public class Loops2 {

	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);

		int f = sc.nextInt();
		
		for (int i = 0; i < f; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int calc = a;
			for (int j = 0; j < n; j++) {
				calc += (Math.pow(2, j) * b);
				System.out.print(calc + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
