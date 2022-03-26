package teste;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String A, String B) {
			   A=A.toLowerCase();
			   B=B.toLowerCase();
			   boolean f = false;
			  char[] c = A.toCharArray();
			  Arrays.sort(c);
			  char[] d = B.toCharArray();
			  Arrays.sort(d);
			  String a = new String (c);
		      String b = new String (d);
		      if (a.equals(b)) {
		    	  f=true;
		      }
		      return f;
		   
		}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		
	}

	}

