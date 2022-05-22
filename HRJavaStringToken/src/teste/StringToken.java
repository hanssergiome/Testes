package teste;

public class StringToken {
	
	    public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         String S = sc.nextLine();
	         String[] tokens = S.split("[^a-zA-Z]");
	         int numTokens = 0;
	         
	         
	         for (int i=0; i<tokens.length; ++i) 
	             if (tokens[i].length() > 0) 
	                 numTokens++;
	             
	         System.out.println(numTokens);
	        

}
}