package Searching;

import java.util.ArrayList;
import java.util.HashMap;


public class PrintSubArrayWithSumZero {

	static class Pair{
		int first, last;
		Pair(int first,int last){
			this.first = first;
			this.last = last;
		}
	}

	//T.C:O(N^2) and S.C:O(N)
	//The basic idea is to calculate sum at every index if sum is repeating or sum becomes zero at any point
	// then there is a subarray in that index. (Beacuse if sum is repeatitve then there occurs some sort of adding and subtracting the same number 
	// thats why sum is getting repeated).
	public static void findSubArrayWithSumZero(int arr[],int size) {
		
		int sum = 0;
		
		ArrayList<Pair> result = new ArrayList<>();
		
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
		
		for(int itr=0;itr<size;itr++) {
			
			ArrayList<Integer> indexList = new ArrayList<>();
			
			//Calculate the sum at every index
			sum += arr[itr];
			
			// If sum becomes zero then add that index to result.
			if(sum==0) {
				result.add(new Pair(0,itr));
			}
			
			if(map.containsKey(sum)) {
				
				//Getting the starting index value of sum.
				indexList = map.get(sum);
				
				for(int itr1:indexList)
					result.add(new Pair(itr1+1,itr));
			}
			
			//Storing the starting index of subarray in the list.
			//We are using list as value because if sum is occurred twice then we need to 
			// store the starting index of every occurrence every sum that's why list
			indexList.add(itr);
			map.put(sum, indexList);
		}
		
		print(result);
	}
	
	public static void print(ArrayList<Pair> result) {
		for(Pair pair:result)
			System.out.println("Sub Array with Sum 0 is "+ pair.first+" "+pair.last);
	}
	
	public static void main(String[] args) {
		 int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
		 int size = arr.length;
		 
		 findSubArrayWithSumZero(arr,size);
		 
		 
	}

}
