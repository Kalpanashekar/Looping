package looping_programs;

public class Program22 {
	
	public static void main(String[] args) {
		int no =2;
		int p=5;
		//2*2*2*2*2
		int i=1;
		int result=1;
		while(i<=p) {
		result	=no*result;
		i++;

		}
		System.out.println(result);

	}
	

}
