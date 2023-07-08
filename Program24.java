package looping_programs;

public class Program24 {
	public static void main(String[] args) {
		
	
	int binary = 1010;
	int decimal=0;
	int i=0;
	int rem;
	
	while(binary>0) {
		rem=binary%2;
		decimal= (int) (decimal+(rem*Math.pow(2, i)));
		binary=binary/10;
		i++;
	}
		System.out.println(decimal);
	}

}
