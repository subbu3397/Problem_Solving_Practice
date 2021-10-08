package Strings;

public class CheckPalindrome {

	//T.C:O(N) and S.C:O(1)
	public static boolean isPalindrome(String s) {
		int start = 0, end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "abba";
		System.out.println("Is Palindrome "+isPalindrome(s));
	}

}
