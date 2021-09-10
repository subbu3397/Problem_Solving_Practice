package Searching;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsToSortArray {

	public static int minimumSwapsToSortArray(int arr[],int size) {
		
		int temp[] = Arrays.copyOfRange(arr,0,size);
		
		Arrays.sort(temp);
		
		int result = 0;
		
		HashMap<Integer,Integer> elementAndIndexMap = new HashMap<>();
		
		for(int itr=0;itr<size;itr++) {
			elementAndIndexMap.put(arr[itr],itr);
		}
		
		for(int itr=0;itr<size;itr++) {
			
			if(arr[itr]!=temp[itr]) {
				int swapIndex = elementAndIndexMap.get(temp[itr]);
				swap(arr,swapIndex,itr);
				result++;
			}
		}
		
		return result;
	}
	
	public static void swap(int arr[],int swapIndex,int swapIndex2) {
		int temp = arr[swapIndex];
		arr[swapIndex] = arr[swapIndex2];
		arr[swapIndex2] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 4, 3, 2 };
		int size = arr.length;
		
		System.out.println("Minimum Number of Swaps to sort the array "+minimumSwapsToSortArray(arr,size));
	}

}
