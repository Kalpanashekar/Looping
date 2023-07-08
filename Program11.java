package looping_programs;

//count of digits
public class Program11 {
	
	public static void main(String[] args) {
		Program11 obj = new Program11();
		int result = obj.print_reverse(123456);
		System.out.println("Count of digits "+ result);
		
		// TODO Auto-generated method st
	}
	private int print_reverse(int plate) {
		int sum = 0;
		int count = 0;
		while(plate>0) {
			sum = sum+(plate%10);

			plate = plate/10;
			count = count+1;
		}
		return count;
	}
	}



