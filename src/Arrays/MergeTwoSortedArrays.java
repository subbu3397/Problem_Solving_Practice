package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void mergeTwoArrays(int arr1[],int arr2[]) {
		int itr1 = arr1.length-1;
		int itr2 = 0;
		for(;itr1>=0&&itr2<arr2.length;itr1--,itr2++) {
			if(arr2[itr2]<arr1[itr1])
				swap(itr1,itr2,arr1,arr2);
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		printResult(arr1,arr2);
	}
	
	public static void printResult(int arr1[],int arr2[]) {
		for(int itr:arr1)
			System.out.print("Sorted Array "+itr);
		System.out.println();
		for(int itr:arr2)
			System.out.print("Sorted Array "+itr);
	}
	
	public static void swap(int index1,int index2,int arr1[],int arr2[]) {
		int temp = arr2[index2];
		arr2[index2] = arr1[index1];
		arr1[index1] = temp;
	}
	public static void main(String[] args) {
		int arr1[] = {2};
		int arr2[] = {1,3,4,6};
		mergeTwoArrays(arr1,arr2);
	}

}
