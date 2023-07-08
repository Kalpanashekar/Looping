package looping_programs;

public class Program25 {
	public static void main(String[] args) {
		int f=-1;
		int s=1;
		int t;
		
		while(true){
			t=f+s;

			System.out.print(t + " ");
			if(t==13)
				break;
			f=s;
			s=t;
		}
		
	}

}
