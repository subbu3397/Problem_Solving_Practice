package Searching;

//Given an unsorted array of size n. Array elements are in the range from 1 to n. One number from set {1, 2, …n} is missing and 
//one number occurs twice in the array.
//Find these two numbers.
public class FindRepeatingAndMissing {

	static class Pair{
		int missingNumber;
		int repeatingNumber;
	}
	
	
	//Iterate the array and use absolute value of the element as an index and make the value at that index as -ve
	//If something is already -ve then it is the negative element
	//Traverse the array and look for positive element that is the missing value
	
	//T.C:O(N) and S.C:O(1)
	public static Pair findRepeatingandMissing(int arr[]) {
		Pair pair = new Pair();
		for(int itr=0;itr<arr.length;itr++) {
			int absValue = Math.abs(arr[itr]);
			if(arr[absValue-1]>0)
				arr[absValue-1] = -arr[absValue-1];
			else
				pair.repeatingNumber=absValue;
		}
		
		 for (int itr = 0; itr < arr.length; itr++) {
	            if (arr[itr] > 0)
	            	pair.missingNumber=itr+1;
	        }
		 
		 return pair;
	}
	
	public static void main(String[] args) {
		int arr[] = {7, 3, 4, 5, 5, 6, 2};
		Pair pair = findRepeatingandMissing(arr);
		System.out.println("Repeating Element"+pair.repeatingNumber +" "+ "Missing Element"+pair.missingNumber);
	}

}
