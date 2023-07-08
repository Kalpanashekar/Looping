package looping_programs;

public class Program16 {
	
	public static void main(String[] args) {
		int no=9;
		int sum=0;
		int sqr=no*no;
		int digit =0;
		while(sqr>0) {
			digit = sqr%10;
			sum=sum+digit;
			sqr=sqr/10;
		}
		if(sum==no) {
			System.out.println("The given no is Neon");
		}
		else {
			System.out.println("The given no is not Neon");
		}
	}

}
