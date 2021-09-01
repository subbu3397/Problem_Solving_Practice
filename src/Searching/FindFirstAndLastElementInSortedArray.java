package Searching;

public class FindFirstAndLastElementInSortedArray {

	//T.C : O(log N) and S.C:O(log N)
	public static int firstOccurenceOfElement(int arr[],int start,int end,int x) {
		if(start<=end) {
			int mid = (start+end)/2;
			
			if(((mid==0)|| arr[mid-1]<x) && arr[mid]==x) {
				return mid;
			}
			
			else if(arr[mid]>x)
				return firstOccurenceOfElement(arr,0,mid-1,x);
			else
				return firstOccurenceOfElement(arr,mid+1,arr.length-1,x);
		}
		return -1;
	}
	
	public static int lastOccurenceOfElement(int arr[],int start,int end,int x) {
		if(start<=end) {
			int mid = (start+end)/2;
			
			if(((mid==arr.length-1)|| arr[mid+1]>x) && arr[mid]==x) {
				return mid;
			}
			
			else if(arr[mid]>x)
				return lastOccurenceOfElement(arr,0,mid-1,x);
			else
				return lastOccurenceOfElement(arr,mid+1,arr.length-1,x);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,3,5,5,5,5,67,123,124};
		int x = 5;
		System.out.println("First Occurence Of Element "+firstOccurenceOfElement(arr, 0, arr.length-1, x));
		System.out.println("Last Occurence Of Element "+lastOccurenceOfElement(arr, 0, arr.length-1, x));
	}
}
