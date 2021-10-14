package Strings;

public class LongestPalindromicSubstring {

	static int resultStart = 0, resultLength = 0;

	//T.C: O(N^2)
	
	//There is one algorithm Manacher its time complexity is O(N) try to understand that alg.
	private static String findLongestPalindromicSubstring(String s) {
		
		String longestPalindromSubString = s.substring(0,1);
		if (s.length() < 2)
			return s;

		//Iterate the string, take every character of string 
		for (int start = 0; start < s.length(); start++) {
			//Consider the current character as middle and try to expand in left and right side with appropriate condition and check they are palindrome
			//If length of string is odd then you will have only one mid point so you will pass the same character as middle point
			String temp = expandRangeFromMid(s, start, start);
			if(temp.length()>longestPalindromSubString.length())
				longestPalindromSubString = temp;
			//If length of string is even then you will have two mid point so you will pass the first character and next character as middle point
			 temp = expandRangeFromMid(s, start, start+1);
			if(temp.length()>longestPalindromSubString.length())
				longestPalindromSubString = temp;
		}

		return longestPalindromSubString;
	}

	//Expanding the string and checking if new strings are palindrome and once the loop exists we will return the substring of the string.
	public static String expandRangeFromMid(String s, int start, int end) {
		while (start >= 0 && end < s.length() && (s.charAt(start) == s.charAt(end))) {
			start--;
			end++;
		}

		return s.substring(start+1,end);
	}

	public static void main(String[] args) {
		String s = "aaaabbaa";

		System.out.println(findLongestPalindromicSubstring(s));
	}

}
