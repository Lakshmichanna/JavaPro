
public class EvenOddCount {

	public static void main(String[] args) {
		
		int evencount = 0, oddcount = 0 ,num = 908739;
		
		while(num>0) {
			
			int d = num%10;
			
			if(d%2==0) {
				
				evencount++;
			}
			else{
				oddcount++;
			}
			 num = num/10;
			
		}
		
		System.out.print("Given number has even number "+evencount+ " odd number "+ oddcount);
		
	}
}
