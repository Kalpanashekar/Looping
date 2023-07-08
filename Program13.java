package looping_programs;
//sum of digits
public class Program13 {
	public static void main(String[] args) {
		
	Program13 obj = new Program13();
	int result = obj.print_reverse();
	System.out.println("Sum of digits: "+ result);
	
	}
	private int print_reverse() {
		int no= 123456;
		int sum = 0;
		while(no>0) {
			sum = sum+(no%10);
			no = no/10;
		}
		return sum;
		
	

}
}