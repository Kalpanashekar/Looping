package looping_programs;

public class Program19 {

	public static void main(String[] args) {
		int no = 5;
		int fact=1;
		
		while(no>0) {
			fact=fact*no;
			
			no--;
			
		}
		System.out.println(fact);
		
	}
}
