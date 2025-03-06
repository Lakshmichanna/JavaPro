
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rev = " ",rev2 = " " ,s = "Basic";
	
		
		 // Logic -1
		int l = s.length();
		
		for(int i=l-1;i>=0;i--) {
			
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse String is :" +rev);
		
		
	//Logic -2
		
		StringBuffer sb= new StringBuffer(s);
		StringBuffer rev1 = sb.reverse();
		System.out.println("Reverse String is :" +rev1);
		
	//Logic -3 
		
		 char a[]= s.toCharArray();
		 
		 for(int i=a.length-1; i>=0;i--) {
			 
			 rev2 = rev2 + a[i];
			 
		 }
		 System.out.println("Reverse String is :" +rev2);
	}

}
