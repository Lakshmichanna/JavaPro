
public class CountdigitsandSumInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0,count=0,n = 7836980;
		
		int norg =n;
		while(n>0) {
			
			
			n=n/10;
			count++;
		}
		
		System.out.println("Count of the digits in numbers is "+ count);
		

		while(norg>0) {
			
			sum = sum+norg%10;
			norg=norg/10;
		}
		System.out.print("Sum of the digits in numbers is "+ sum);
	}

}
