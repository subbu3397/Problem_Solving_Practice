package Searching;


//Maximum and minimum of an array using minimum number of comparisons
public class MinimumAndMaximumInArray {

	public static class Pair{
		int minimum;
		int maximum;
	}
	
	//T.C: O(N) and S.C:O(1)
	//The basic idea is to compare the array elements in pair
	public static Pair findMinimumMaximumElement(int arr[],int size) {
		Pair minmax = new Pair();
		int itr=0;
		
		//To compare the array elements in pair we are checking size of array if it is odd then min and max will be 1st element 
		// of array then only we can compare rest of array elements in pair if array size is even then compare first two elements
		// and based on that initialize the maximum and minimum values.
		if(size%2==0) {
			if(arr[0]>arr[1]) {
				minmax.maximum = arr[0];
				minmax.minimum = arr[1];
			}
			else {
				minmax.maximum = arr[1];
				minmax.minimum = arr[0];
			}
			itr=2;
		}
		else {
			minmax.maximum = arr[0];
			minmax.minimum = arr[1];
			itr=1;
		}
		
		//Now start comparing the rest of elements in array with prev maximum and minimum.
		while(itr<size-1) {
			
			//Normal Comparison logic
			if(arr[itr]>arr[itr+1]) {
				if(arr[itr]>minmax.maximum) {
					minmax.maximum = arr[itr];
				}
				if(arr[itr+1]<minmax.minimum) {
					minmax.minimum = arr[itr+1];
				}
			}
			else if(arr[itr]<arr[itr+1]) {
				if(arr[itr]<minmax.minimum) {
					minmax.minimum = arr[itr];
				}
				if(arr[itr+1]>minmax.maximum) {
					minmax.maximum = arr[itr+1];
				}
			}
			
			itr+=2;
			/* Increment the index by 2 as two 
            elements are processed in loop */
		}
		return minmax;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1000,11,445,1,330,3000};
		int size = arr.length;
		Pair minmax = findMinimumMaximumElement(arr,size);
		System.out.println("Maximum"+minmax.maximum+ " "+ "Minimum"+minmax.minimum);
	}

}
