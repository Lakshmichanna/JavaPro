import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter 3 integers ");
		        int a = scanner.nextInt();
		        int b = scanner.nextInt();
		        int c = scanner.nextInt();

		        System.out.println("You entered: " + a + ", " + b + ", and \"" + c + "\"");
		        
		        //Logic-1
		        
		        if(a>b&&a>c) {
		        	System.out.println(a+ " A is the largest Number");
		        }
		        else if(b>a&&c>a) {
		        	
		        	System.out.println(b+ " B is the largest Number");
		        }
		        else if(c>a&&c>b) {
		        	
		        	System.out.println(c+ " C is the largest Number");
		        	
		        }
		        
		        
		        //Logic-2 
		        
		        int largest = c>(a>b?a:b)?c:(a>b?a:b);
		        
		        System.out.println(largest+ " is the largest Number ");
		    }
		

}
