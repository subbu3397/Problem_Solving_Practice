package Searching;

public class BinarySearch {

	public static int findNumber(int arr[], int x) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int middle = (left + right) / 2;
			if (arr[middle] == x)
				return middle;
			if (arr[middle] > x) {
				right = middle-1;
			} else {
				left = middle+1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int x = 8;
		System.out.println("Element found in the index" + findNumber(arr, x));
	}

}
