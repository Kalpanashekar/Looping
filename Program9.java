
package looping_programs;

public class Program9 {
	public static void main(String[] args) {
		int number = 13;
		int count=0;
		for(int divisor=2; divisor<number; divisor++) {
			if(number%divisor==0) {
			count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("The given number is prime");
		}
		else {
			System.out.println("The given number is not prime");
		}
	
}
}

		