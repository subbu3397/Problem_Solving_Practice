package Strings;

import java.util.*;

//T.C : O(n log(n))
public class CheckStringIsaValidShuffleOfTwoStrings {

	public static boolean checkLength(String first, String second, String result) {
		if (first.length() + second.length() == result.length()) {
			return true;
		}

		return false;
	}

	public static boolean checkSuffle(String first,String second,String result) {
		
		String combinedString = sortString(first+second);
		result = sortString(result);
		
		if((combinedString).equals(result))
			return true;
		else
			return false;
	}

	public static String sortString(String value) {
		char arr[] = value.toCharArray();
		//T.C : O(n log(n))
		Arrays.sort(arr);

		String sortedString = String.valueOf(arr);

		return sortedString;
	}

	public static void main(String[] args) {
		String first = "XY";
		String second = "12";
		String result = "1XY2";
		
		if(checkLength(first,second,result)&& checkSuffle(first, second, result))
			System.out.println("The given string is valid suffle of two string");
		else
			System.out.println("The given string is not valid suffle");
	}

}
