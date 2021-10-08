package Strings;

import java.util.HashSet;

public class DuplicatesInString {

	public static void findDuplicates(String str) {
		HashSet<Character> set = new HashSet<>();
		
		for(int itr=0;itr<str.length();itr++) {
			if(!set.add(str.charAt(itr)))
				System.out.println(str.charAt(itr));
		}
		
	}
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		findDuplicates(str);
	}

}
