package looping_programs;

public class Program8 {
		
	
	public static void main(String[] args) {
		int number = 18;
		int count = 0;
		for(int divisors=2; divisors<number; divisors++) {

			if(number%divisors==0) {
				//System.out.println(divisors);
				count++;
			}
		
		}
System.out.println(count);
	} 

}
