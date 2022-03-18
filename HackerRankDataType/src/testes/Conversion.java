package testes;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Conversion {

	
	    
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double pagamento = sc.nextDouble();
	        sc.close();
	        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
	        String us = n.format(pagamento);
	        
	       NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
	        String india = n1.format(pagamento);
	        
	        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        String china = n2.format(pagamento);
	        
	        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        String france = n3.format(pagamento);
	        
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    
	}
}
