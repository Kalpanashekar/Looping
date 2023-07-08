package looping_programs;

public class Program31 {
public static void main(String[] args) {
	int no = 98765;
	int total;
  total=no;
	while(total>9) {
      no=total;
	  total= 0;
	while(no>0) {
	int	rem =no%10;
	total=total+rem;
	no=no/10;
		
	}
		
	}
	System.out.println(total);
}
}
