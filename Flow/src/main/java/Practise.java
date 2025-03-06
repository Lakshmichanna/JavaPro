import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Practise {


	public static void main(String[] args) {

 
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(), orgst, rev ="";
		
		orgst = s;
		
		for(int i=s.length()-1;i>=0;i--) {
			
			 rev = rev +s.charAt(i);
			 
			
		}
		
		
		if(orgst.equalsIgnoreCase(rev)) {
			
			System.out.print("Given string is palindrome");
		}
		else {
			System.out.print("Given string is not palindrome");
		}
		
		
		
		
		
		
		
	}


}