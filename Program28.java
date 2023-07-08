package looping_programs;

public class Program28 {
	public static void main(String[] args) {
		int f=-1;
		int s=1;
		
		for(int i=1; i<=9; i++) {
			

			System.out.print(f + s + " ");
			
			s=f+s;
			f=s-f;




		}
		
		
	}

}
