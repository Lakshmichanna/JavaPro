import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// LinkedHashSet is case sensitive 
		        ArrayList<String> list = new ArrayList<>();
		        list.add("Java");
		        list.add("Selenium");
		        list.add("Java");
		        list.add("Python");

		        LinkedHashSet<String> set = new LinkedHashSet<>(list);
		        list.clear();
		        list.addAll(set);

		        System.out.println("List after removing duplicates: " + list);
		        
		        
		      // Approach -2 
		        
		        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "apple", "Orange", "BANANA"));

		        LinkedHashSet<String> set1 = new LinkedHashSet<>();
		        for (String item : list1) {
		            set1.add(item.toLowerCase()); // Convert all to lowercase
		        }
		        
		        
		        LinkedHashSet<String> set2 = new LinkedHashSet<>(list1);
		        System.out.println("Unique Elements (Case-Insensitive): " + set1);
		        System.out.println("Elements: " + set2);
		        
		    }
		}

