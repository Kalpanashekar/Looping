package looping_programs;
import java.util.Scanner;
public class Program39 {
	public static void main(String[] args) {
		int no;
		int sum=0;
		int product=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		no=sc.nextInt();
		while(no>0) {
			int rem=no%10;
			sum=sum+rem;
			product=(rem*product);
			no=no/10;
		}
		if(sum==product) {
			System.out.println("The given number is spy number");
		}
		else {
			System.out.println("The give number is not a spy number");
		}
	}

}
