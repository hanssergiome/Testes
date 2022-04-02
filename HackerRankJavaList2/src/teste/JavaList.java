package teste;

import java.util.LinkedList;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        LinkedList<Integer> list = new LinkedList<>();
		        int n = sc.nextInt();
		        for (int i = 0; i < n; i++) {
		            list.add(sc.nextInt());
		        }
		        n = sc.nextInt();
		        for (int i = 0; i < n; i++) {
		            if (sc.next().equals("Insert")) 
		                list.add(sc.nextInt(), sc.nextInt());
		            else 
		                list.remove(sc.nextInt());
		        }
		        sc.close();

		        for (Integer i : list) {
		            System.out.print(i + " ");
		        }
		    }
		}

	


