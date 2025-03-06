import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number ");
		int rev = 0, num =sc.nextInt();
		
		int orgnum = num;
		 
		while(num!=0) {
			
			rev = rev*10+num%10;
			num = num/10;
			
		}
		
		System.out.println("Reverse number :" +rev);
		
		if(orgnum==rev) {
			System.out.println(orgnum +" is Palindrome");
		}
		else {
			System.out.println(orgnum +" is not Palindrome");
		}
		
		
		
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the String ");
		
		String s= sc1.next();
		
		String revst= " ", orgst=s;
		
		for(int i=s.length()-1;i>=0;i--) {
			revst = revst + s.charAt(i);
			
		}
		System.out.println("Reverse String :" +revst);

		if(orgst.equals(revst)) {
			System.out.println(orgst +" is Palindrome");
		}
		else {
			System.out.println(orgst +" is not Palindrome");
		}
		
	}

	
	
	
}
