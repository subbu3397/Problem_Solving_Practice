package Searching;

public class ProductArrayPuzzle {

	// Brute Force Approach : O(N^2)
	public static int[] productArrayPuzzle(int arr[], int size) {
		int counter = 0;
		int product[] = new int[size];
		while (counter < size) {
			int prod = 1;
			for (int itr = 0; itr < size; itr++) {
				if (itr != counter)
					prod *= arr[itr];
			}

			product[counter] = prod;
			counter++;
		}

		return product;
	}

	//Calculate product of whole array then divide the product value by each array element
	public static int[] productArrayPuzzle1(int arr[], int size) {
		int product[] = new int[size];
		int temp = 1;
		for (int itr = 0; itr < size; itr++) {
			temp *= arr[itr];
		}
		for (int itr = 0; itr < size; itr++) {
			product[itr] = temp / arr[itr];
		}

		return product;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 3, 5, 6, 2 };
		int size = arr.length;

		int result[] = productArrayPuzzle(arr, size);

		for (int itr : result) {
			System.out.print(itr + " ");
		}
		
		int result2[] = productArrayPuzzle(arr, size);
		for (int itr : result2) {
			System.out.print(itr + " ");
		}
	}

}
