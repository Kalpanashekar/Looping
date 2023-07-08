package looping_programs;

public class Program17 {
	
	public static void main(String[] args) {
		int no = 145;
		int sum =0;
		int temp=no;
		int i=1;
		int fact;
		int digit;
		
		
		while(temp!=0) {
			i=1;
			fact=1;
			digit=temp%10;
			
			while(i<=digit) {
				fact= fact*i;
				i++;
				
			}
			sum=sum+fact;
			temp=temp/10;
		}
		
if(sum==no) {
	
	System.out.println(no + " is a strong number");
	
}
else {
	System.out.println(no + " is not a strong number");
}
		}
	}

