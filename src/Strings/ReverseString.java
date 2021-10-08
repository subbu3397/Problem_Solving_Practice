package Strings;

public class ReverseString {

	//T.C:O(N) and S.C:O(1)
	public static char[] reverseString(char[] s) {
		int start = 0,end = s.length-1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return s;
	}
	public static void main(String[] args) {
		char[]  s = {'h','e','l','l','o'};
		s = reverseString(s);
		for(int itr=0;itr<s.length;itr++) {
			System.out.println(s[itr]);
		}
		
	}

}
