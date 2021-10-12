package Strings;

public class CheckOneStringIsRotationOfOther {

	public static boolean checkOneStringIsRotationOfOther(String s1,String s2) {
			if((s1.length()==s2.length()) && ((s1+s1).indexOf(s2)!=-1))
				return true;
			else
				return false;
		
	}
	
	
	public static void main(String[] args) {
		String s1="ABCD";
		String s2="CDAB";
		System.out.println(checkOneStringIsRotationOfOther(s1,s2));
		
	}

}
