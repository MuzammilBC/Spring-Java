package basic_SpringBoot;

import java.util.HashMap;
import java.util.Scanner;

public class SimpleString {  
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.next();
		// Create a HashMap to store the occurrence count of each alphabet
		HashMap<Character, Integer> omp = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(omp.containsKey(str.charAt(i))) {
				int count=omp.get(str.charAt(i));
				omp.put(str.charAt(i),++count);

			}
			else {
				omp.put(str.charAt(i), 1);
			}

		}
		System.out.println(omp);

	}

}
