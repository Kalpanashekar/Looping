package looping_programs;
//reverse the number
public class Program12 {
	
	public static void main(String[] args) {
		int sum = 0;
		//for(int no=1234; no>0; no=no/10){
			//sum = (sum*10)+(no%10);
int no = 1234;
while(no>0) {
	sum = (sum*10)+ (no%10);
	no = no/10;
	
		}
		System.out.print(sum);

	}

}
