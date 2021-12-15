package Strings;


//T.C:O(N).
public class MinimumNumberOfFlips {

	//Method to flip the character.
	public static char flip(char ch) {
		return (ch=='0') ? '1':'0';
	}
	
	
	public static int minimumNumberOfFlips(String s, char startingFrom) {
		//Initialize the counter
		int flipCount = 0;
		//Iterate the string 
		for(int itr=0;itr<s.length();itr++) {
			//Compare the char of string and expected character if it is not same then increment the counter.
				if(s.charAt(itr)!=startingFrom) {
					flipCount++;
				}
				//Flip the character as it needs to be different for next character.
				startingFrom = flip(startingFrom);
		}
		
		return flipCount;
	}
	
	//Start with String 0 and String 1.
	public static int findMinFlips(String s) {
		return Math.min(minimumNumberOfFlips(s,'0'),minimumNumberOfFlips(s,'1'));
	}
	
	public static void main(String[] args) {
		String s = "0001010111";
		System.out.println(findMinFlips(s));
	}

}
