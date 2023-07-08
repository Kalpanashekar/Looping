package looping_programs;

public class Program21 {
	
	public static void main(String[] args) {
		int no1=3;
		int no2=5;
		int max= no1>no2?no1:no2;
		
		while(true) {
			if(max%3==0&&max%5==0) {
				System.out.println(max);
				break;
			}
			max++;

		}
				
		
	}
}
