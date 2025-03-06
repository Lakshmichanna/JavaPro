import java.util.Arrays;
import java.util.Scanner;

public class Bubblesortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
int arr[] = { 70,90,30,20,50,60,10,80,41,100};
		
		int temp = 0;
		
		//no.of passes
		for(int i=0; i <arr.length;i++) { //0, 1
			
			// no. of iterations 
			for(int j=i+1;j<arr.length;j++) { //1, 2
				 // for ascending order use less than & for descending order use >	
				
				if(arr[j]>arr[i]) { // 90>70 = 70, 90 / 30>90= 70,30,90/ 90>20
					
					temp =arr[i];  // temp = 70
					arr[i]=arr[j];  // i = 90
					arr[j] = temp; // j = 70
				}
			}
		}
				
		
		System.out.print("sorted array"+ Arrays.toString(arr));
		
		
		
	

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter the number of elements in array: ");

		int n = sc.nextInt();
		 
		int [] a = new int[n];


		System.out.println(" Enter " +n + " elements : ");

		 for(int i =0; i<n; i++) {
			 
			 a[i] = sc.nextInt();
		 }

		   System.out.println("Given array" + Arrays.toString(a));
		   
		 
		   int temp1=0;
		   
		   for(int i =0; i<a.length;i++) {
			   
			   
			   for(int j= i+1;j<a.length;j++) {
				   
				   if(a[j]<a[i]) {
					   
					   temp1 = a[i];
					   a[i] =a[j];
					   a[j] = temp1;
					   
				   }
				   
			   }
		   }
		   
		   System.out.println("Sorted array is: " +Arrays.toString(a));
				
				
			}


}
