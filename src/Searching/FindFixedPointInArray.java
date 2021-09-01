package Searching;

//Given an array of n distinct integers sorted in ascending order, write a function that returns a Fixed Point in the array, 
//if there is any Fixed Point present in array, else returns -1.
//Fixed Point in an array is an index i such that arr[i] is equal to i. Note that integers in array can be negative. 
public class FindFixedPointInArray {

	//T.C:O(log N)
	public static int findFixedPoint(int arr[],int start,int end) {
		if(start<=end) {
			int mid = (start+end)/2;
			
			if(arr[mid]==mid)
				return mid;
			else if(arr[mid]<mid)
				return findFixedPoint(arr,mid+1,arr.length-1);
			else
				return findFixedPoint(arr,0,mid-1);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-10, -5, 0, 3, 7};
		System.out.println("Find Fixed Point"+ findFixedPoint(arr,0,arr.length-1));
	}

}
