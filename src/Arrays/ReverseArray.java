package Arrays;

public class ReverseArray {

	// Iterative Approach
	private static void reverseArray(int[] arr) {
		int start = 0, end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	// Recursive Approach
	private static void reverseArrayUsingRecursion(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArrayUsingRecursion(arr, start + 1, end - 1);
	}

	public static void printArr(int arr[]) {
		System.out.println();
		for (int itr : arr)
			System.out.print(itr + " ");
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		reverseArray(arr);
		printArr(arr);
		reverseArrayUsingRecursion(arr, 0, arr.length - 1);
		printArr(arr);
	}

}
