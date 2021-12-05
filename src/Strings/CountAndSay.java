package Strings;

//For Example saying the conversion string: 3322251

//Then result will be 2 3's 3 2's 1 5 and 1 1.
public class CountAndSay {

	//T.C:O(n^2).
	 public static String countAndSay(int n) {
	        String s = "1";
	        for(int itr=1;itr<n;itr++){
	            s = countSeq(s);
	        }
	        
	        return s;
	    }
	    
//Iterate the input and count the frequency of characters and append the count and character into string.
	    public static String countSeq(String seq){
	        StringBuilder sb = new StringBuilder();
	        char c = seq.charAt(0);
	        int count = 1;
	        for(int itr=1;itr<seq.length();itr++){
	            if(seq.charAt(itr) == c){
	                count++;
	            }
	            else
	            {
	                sb.append(count);
	                sb.append(c);
	                c = seq.charAt(itr);
	                count = 1;
	            }
	        }
	        sb.append(count);
            sb.append(c);
	        return sb.toString();
	    }
	    
	public static void main(String[] args) {
		int n =4;
		System.out.println(countAndSay(n));
		
	}

}
