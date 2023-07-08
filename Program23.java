package looping_programs;

public class Program23 {
	
	public static void main(String[] args) {
		
		int decimal=8;
		int rem;
		String binary="";
		
		while(decimal>0) {
			rem=decimal%2;
			binary=rem+binary;

			decimal=decimal/2;
			System.out.println(binary);
		}
		System.out.println(binary);
		
	}

}
