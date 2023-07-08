package looping_programs;

public class Program30 {
	
	public static void main(String[] args) {
		
		int no=3;
		int count = 0;
		boolean prime = true;
		
		int i=2;
		while(count<10) {
		while(i<no) {
			if(no%i==0) {
				System.out.println("Not prime");
				prime=false;
			}
			i++;
	
		}
		if(prime==true) {
			System.out.println(no + " is prime");
			count++;
		}
		no=no+2;
		}
	}
}


