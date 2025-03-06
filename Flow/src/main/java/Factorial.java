import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the number to factorial: ");
		 
		 
		int num = sc.nextInt();
		
		long factorial =1;  // used long bcz multiply can be of large number which int limit can be exceed 
		
		for(int i=1;i<=num;i++) {
			
			factorial = factorial*i ;
		}
		
		 System.out.println("Factorial of given number is: "+factorial);

	}

}
