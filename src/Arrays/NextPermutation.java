package Arrays;

//Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

//If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

//The replacement must be in place and use only constant extra memory.
public class NextPermutation {

	//T.C:O(N) and S.C:O(1)
	public static int[] findNextPermutation(int arr[]) {

		int breakPointNumber = -1;
		int changePointNumber = 0;
	
		//Traverse the array and find the first decreasing element in array.
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i - 1] < arr[i]) {
				breakPointNumber = i - 1;
				break;
			}
		}
		
		//Now traverse the array again and find the element which is greater than breakPointNumber.
		if (breakPointNumber != -1) {
			for (int i = arr.length - 1; i > 0; i--) {
				if (arr[i] > arr[breakPointNumber]) {
					changePointNumber  = i;
					break;
				}
			}
			
		//Swap those two elements
			swap(arr,breakPointNumber,changePointNumber);
		}
		
		//Reverse the second part of array.
		reverse(arr,breakPointNumber+1,arr.length-1);
		return arr;
	}
	
	public static void swap(int arr[],int breakPointNumber,int changePointNumber) {
		int temp = arr[breakPointNumber];
		arr[breakPointNumber] = arr[changePointNumber];
		arr[changePointNumber] = temp;
	}
	
	public static void reverse(int arr[],int start,int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3,2,1 };
		int result[] = findNextPermutation(arr);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
	}

}
