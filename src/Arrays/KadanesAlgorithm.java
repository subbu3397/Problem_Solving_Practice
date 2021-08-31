package Arrays;

public class KadanesAlgorithm {

	// T.C:O(N) //S.C:O(1)
	// The idea is to maintain the localMaximum for each index of the array and
	// compare with global max
	public static int findLargestContSum(int arr[]) {
		int localMax = 0;
		int globalMax = Integer.MIN_VALUE;
		int maxValue = Integer.MIN_VALUE;

		// This is to handle the edge case if all the elements in array are negative we
		// need to return the maximum element in array.
		for (int i = 0; i < arr.length; i++) {
			maxValue = Math.max(maxValue, arr[i]);
		}
		if (maxValue < 0)
			return maxValue;

		for (int i = 0; i < arr.length; i++) {
			localMax = Math.max(0, localMax + arr[i]);
			if (localMax > globalMax)
				globalMax = localMax;
			
			if (localMax < 0)
				localMax = 0;
		}
		return globalMax;

	}

	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Largest Cont Sum" + findLargestContSum(arr));
	}

}
