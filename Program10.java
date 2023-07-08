package looping_programs;
//reverse the number
public class Program10 {
	public static void main(String[] args) {
		
	/*int no = 6543;
	int sum = 0;
	while(no>0) {
		sum = (sum*10)+(no%10);
		no=no/10;
	}
	System.out.println(sum);
	}
}*/
		int sum =0;
		for(int no =6543; no>0;no=no/10) {
			sum = (sum*10)+(no%10);
			
		}
		System.out.println(sum);
	}
}