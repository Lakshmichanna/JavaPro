import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 10,20,30,40,50,60,70,80,91,100}
		
		int temp;
		
		for(int i=0; i <arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length-1;j++) {
				
				
				if(arr[j]<arr[i]) {
					
					temp[i]=arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
				
		
		System.out.print("sorted array"+ Arrays.toString(arr));
	}

}
