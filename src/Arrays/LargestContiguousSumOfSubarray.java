package Arrays;

public class LargestContiguousSumOfSubarray {

	//T.C:O(N)
	// It is based on Kadanes algorithm with slight Modification two work with full negative integers.
	public static int findLargestContSum(int arr[]) {
		int max_ending_here=0;
		//Important Step if all the element in array is negative
		int max_so_far = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max_ending_here = max_ending_here+arr[i];
			if(max_ending_here<arr[i])
				max_ending_here = arr[i];
			if(max_so_far<max_ending_here)
				max_so_far = max_ending_here;
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, 2, 1, 5, -3 };
		System.out.println("Largest Continugous Sum "+findLargestContSum(arr));
	}

}
