package looping_programs;
//Amstrong Number

import java.util.Scanner;

public class Program15 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	int no=	sc.nextInt();
	
	int rem=0;
	int amr=0;
	int result=no;
	while(result!=0) {
		rem=result%10;

		amr=amr+(rem*rem*rem);
		
result = result/10;
		
	}

	
	if(amr==no) {
		System.out.println("The given no is amstrong");
	}
	
	else {
		System.out.println("The given no is not an amstrong");
	
	}
	}
}

