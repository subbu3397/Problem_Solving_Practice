package Strings;


//You are given a string S of 2N characters consisting of N ‘[‘ brackets and N ‘]’ brackets.
//A string is considered balanced if it can be represented in the for S2[S1] where S1 and S2 are balanced strings.
//We can make an unbalanced string balanced by swapping adjacent characters.
//Calculate the minimum number of swaps necessary to make a string balanced.
//Note - Strings S1 and S2 can be empty.
public class MinimumSwapsForBracketBalancing {

	
	public static int minSwapsForBracketSwapping(String s) {
		int leftCount = 0, rightCount = 0, imbalance = 0,swap=0;
		
		char ch[] = s.toCharArray();
		
		for(int itr=0;itr<s.length();itr++) {
			
			//Count the number of opening brackets
			if(ch[itr]=='[') {
				leftCount++;
				
				//If imbalance is greater than 0 then add the imbalance to swap that required and decrement the
				//imbalance by 1 because we can only swap with adjacent characters thats why decrementing imbalance by 1.
				if(imbalance>0) {
					swap += imbalance;
					imbalance--;
				}
			}
			else {
				//Count the number of closing brackets
				rightCount++;
				//Count the imbalance between opening and closing bracket
				imbalance = rightCount-leftCount;
			}
		}
		
		return swap;
		
	}
	public static void main(String[] args) {
		String s = "[]][][";
		System.out.println(minSwapsForBracketSwapping(s));
	}

}
