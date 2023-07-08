package looping_programs;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
	int no=	sc.nextInt();
	for(int div=2; div<=no; div++) {
		if(no%div==0) {
		System.out.println(div);
		
		}
	}
				
	}

}
