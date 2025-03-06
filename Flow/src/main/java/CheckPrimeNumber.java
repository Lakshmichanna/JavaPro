import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// Check the given number is prime or not

		// Prime number should have only 1 & itself as factor

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number");

		int count=0,check = sc.nextInt();

		if(check>1) {


			for(int i=1;i<=check;i++) {

				if(check%i==0) 
					count++;
			}
			if(count==2) {
				System.out.print(check+" Number is a Prime Number");
			}
			else {
				System.out.print(check+ " Number is not Prime Number");
			}
		}

		else {
			System.out.print(check+ " Number is not Prime Number");
		}



// Approcah -2 
		
		


		System.out.println("Enter the number to check prime");

		  int check1 = sc.nextInt();
		  boolean isprime = true;
		  
		  if(check1 >1) {
			  
			  
			  for(int i =2;i<=Math.sqrt(check1); i++) {
				  
				  
				  if(check1%i==0) {
					  
					  System.out.println(" Given number " +check1 + " is not Prime Number") ;
					  isprime = false;
					  break;
					  
				  }
				 
			  }
			  if(isprime) {
				  System.out.println(" Given number " +check1 + " is Prime Number") ;
			  }
			  
		  }
		  else {
			  
			  System.out.println(" Given number " +check1 + " is not Prime Number") ;
		  }
				
			}

		}


