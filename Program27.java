package looping_programs;

public class Program27 {
	public static void main(String[] args) {
		float first=12.0f;
		float second=24.5f;
		
		System.out.println("Before swapping numbers: " + first +" " + second);
		first= first+second;
		second=first-second;
		first=first-second;
		System.out.println("After swapping numbers: " + first + " " + second);
		

		
	}

}
