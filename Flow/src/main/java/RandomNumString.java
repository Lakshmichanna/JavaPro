import java.util.Random;

public class RandomNumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach -1 
		
		Random r = new Random();
		
		int n =r.nextInt(10); // range of the interger ()
		
		System.out.println(n);
		System.out.println(r.nextDouble());
		
		//Approach-2
		
		System.out.println(Math.random());
		
		
		
		
		
		
	}

}
