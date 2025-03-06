import java.util.ArrayList;
import java.util.Arrays;

public class ArraySumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int a[] = {5,8,9,17,58,50,88};

		int sum= 0, ev =0 ,od =0;


		//Approach-1

		for(int c :a ) {

			sum =sum+c;
		}
		System.out.println("Sum of the numbers in Array: " +sum);

		//Approach-2

		for(int i=a.length-1;i<=0;i--) {

			sum =sum+a[i];

		}

		System.out.println("Sum of the numbers in Array2: " +sum);


		//<-------Even & Odd -------->
		ArrayList<Integer> e = new ArrayList<>();
		ArrayList<Integer> o = new ArrayList<>();

		for(int i=0;i<a.length;i++) {

			if(a[i]%2==0) {
				e.add(a[i]); 

				System.out.println("Even Number " +a[i]);


			}
			else if(a[i]%2!=0) {


				o.add(a[i]); 
				System.out.println("Odd Number " +a[i]);

			}
			else {
				System.out.println("Invalid Number");
			}
		}
		System.out.println(e);
		System.out.println(o);

	}

}
