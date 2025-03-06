import java.util.*;

public class CaseInsensitiveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "apple", "Orange", "BANANA"));

        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String item : list) {
            set.add(item.toLowerCase()); // Convert all to lowercase
        }

        System.out.println("Unique Elements (Case-Insensitive): " + set);
    }
}
