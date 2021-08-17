package Arrays;

public class CyclicallyRotateArrayByOne {

	public static int[] cyclicRotationOfArray(int arr[]) {
		int lastElementOfArray = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--)
			arr[i] = arr[i - 1];
		arr[0] = lastElementOfArray;
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		cyclicRotationOfArray(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i]);
	}

}
