package Strings;

public class SplitBinaryStringsWithEqualNumberOfOnesandTwos {

	public static int splitEqualNumberOfOnesandTwos(String str) {
		int countZero = 0 , countOne = 0;
		int count = 0;
		for(int itr=0;itr<str.length();itr++) {
			if(str.charAt(itr)=='0') {
				countZero++;
			}
			else {
				countOne++;
			}
			
			if(countZero==countOne)
				count++;
		}
		
		if(count==0)
			return -1;
		else
			return count;
		
	}
	
	public static void main(String[] args) {
		String str = "0100110101";
		System.out.println(splitEqualNumberOfOnesandTwos(str));
	}

}
