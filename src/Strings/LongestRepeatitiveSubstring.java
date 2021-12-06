package Strings;

//Given a string str, find the length of the longest repeating subsequence such that it can be found twice in the given string.
//The two identified subsequences A and B can use the same ith character from string str if and only if that ith character has different
//indices in A and B.
public class LongestRepeatitiveSubstring {

	//T.C:O(N ^ 2).
	public static int longestRepeatitiveSubString(String s) {
		int maxLength = 0;
		int stringLength = s.length();
		
		int startOfSubsequence = 0;
		int length = 0;
		//Iterate the strings
		for(int itr=0;itr<stringLength-1;itr++) {
			//Compare the two characters and if both are same then store the start index.
			if(s.charAt(itr)==s.charAt(itr+1)) {
				startOfSubsequence = itr;
				//Start iterating the rest part of string increment the counter once the condition is failed find the length by
				//subtracting the counter and startOfSubSequence.
				while(s.charAt(itr)==s.charAt(itr+1)) {
					itr++;
				}
				length = itr-startOfSubsequence+1;
			}
				//Store the max length and return it.
				maxLength = Math.max(maxLength, length);
		}
		
		return maxLength;
		
	}
	public static void main(String[] args) {
		String s = "ABCCCHYYYYG";
		System.out.println(longestRepeatitiveSubString(s));
	}

}
