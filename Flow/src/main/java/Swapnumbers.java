
public class Swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a =10, b= 20;

		// Logic-1 - using third variable

		int t = a;
		a=b;
		b=t;

		System.out.println(" Logic-1 After swaping the numbers " +a+ " " +b);

		// Logic-2 - using + & -

		a= a+b;
		b= a-b;
		a= a-b;

		System.out.println(" Logic-2 After swaping the numbers " +a+ " " +b);

		// Logic-3 - using *& /

		a= a*b;
		b= a/b;
		a= a/b;

		System.out.println(" Logic-3 After swaping the numbers " +a+ " " +b);

		// Logic-4 - using bit wise operator ^

		a= a^b;
		b= a^b;
		a= a^b;

		System.out.println(" Logic-4 After swaping the numbers " +a+ " " +b);
		
		
		// Logic-5 - using single statement

		b = a+b-(a=b);

		System.out.println(" Logic-5 After swaping the numbers " +a+ " " +b);



	}

}
