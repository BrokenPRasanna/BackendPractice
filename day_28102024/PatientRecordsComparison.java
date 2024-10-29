package day_28102024;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class PatientRecordsComparison {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(101, "John Doe");
		hashMap.put(102, "Alice Brown");
		hashMap.put(103, "Charlie Green");

		System.out.println("HashMap (unordered): " + hashMap);

		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(101, "John Doe");
		hashtable.put(102, "Alice Brown");
		hashtable.put(103, "Charlie Green");

		System.out.println("Hashtable (unordered, synchronized): " + hashtable);

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(101, "John Doe");
		linkedHashMap.put(102, "Alice Brown");
		linkedHashMap.put(103, "Charlie Green");

		System.out.println("LinkedHashMap (insertion-ordered): " + linkedHashMap);
	}
}
