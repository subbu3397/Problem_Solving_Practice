package Searching;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerBySetBits {

	//T.C:O(N log N)
	public static void sortIntegerByBits(int arr[],int size) {
	
		ArrayList<Integer> list = new ArrayList<>();
		for(int itr:arr) {
			list.add(itr);
		}
		
		Collections.sort(list,(a,b)->Integer.bitCount(a)==Integer.bitCount(b)? a-b:Integer.bitCount(a)-Integer.bitCount(b));
		
		for(int itr=0;itr<list.size();itr++)
			arr[itr] = list.get(itr);
		
		for(int itr:arr)
			System.out.print(itr+" ");
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {0,1,2,3,4,5,6,7,8};
		int size = arr.length;
		sortIntegerByBits(arr,size);
	}

}
