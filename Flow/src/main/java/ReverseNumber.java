import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Logic -1 
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int rev =0;
		while(num!=0) {
			
			 
			 
			 rev = rev*10 + num%10; // 0*10 +4 = 4 ; 4*10 +3 =43; 430+2=432 ; 4320+1 = 4321
			 num = num/10;   	// 1234/10 = 123 ; 123/10= 12; 12/10 =1 ; 1/10 = 0			
		}
		System.out.println(" Reverse number is "+ rev);
		
		
		// Logic -2

		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder	rev1 = sb.reverse();
		
		System.out.println(" Reverse number is "+ rev1);
		
		//Logic -3 
		
		StringBuffer sf = new StringBuffer(String.valueOf(num));
		StringBuffer rev2 = sf.reverse();
		System.out.println(" Reverse number is "+ rev2);
		
		
	}

}
