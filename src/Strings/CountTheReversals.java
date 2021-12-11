package Strings;

import java.util.Stack;

public class CountTheReversals {

	//T.C:O(N) and S.C:O(N)
	public static int countReversals(String s) {
		
		//Iterate the string and check if it is { if yes then put it in stack if it is } and stack is empty then we need to get pair so insert { and 
		// increment the counter if stack is not empty then pop it because pair will be formed.
		Stack<Character> stack = new Stack<>();
		int count =0;
		for(int itr=0;itr<s.length();itr++) {
			if(s.charAt(itr)=='{') {
				stack.push(s.charAt(itr));
			}
			else {
				if(stack.isEmpty()) {
					stack.push('{');
					count++;
				}
				else {
					stack.pop();
				}
			}
		}
		
		//Finally return count (no of reversals made by us) + stack size where the no.of reversal required.
		count = count+(stack.size()/2);
		return count;
	}
	public static void main(String[] args) {
			String s = "}{{}}{{{";
			System.out.println(countReversals(s));

	}

}
