import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number to find prime numbers within the number ");

		int check,num = sc.nextInt();

		for(int i=2;i<=num;i++) { // 5
			check =0;
			for(int j=2;j<i;j++) { // 5/2, 5/3,5/4/,

				if(i%j==0) {

					check++;
					break;
				}
			}
			if(check==0) {
				System.out.print(i+" ");
			}			
		}


	}

}
