package Arrays;

//Sort 0's 1's 2's of array.
public class Sort0s1s2sWithoutUsingSortingAlgo {

	//T.C:O(n) and S.C:O(1)
	//Using Dutch national flag algorithm.
	public static int[] sort0s1s2sWithoutUsingSortingAlgo(int arr[]) {
		
		int low = 0, mid = 0, high = arr.length - 1;
		
		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(low,mid,arr);
				low++;
				mid++;
			}
			else if(arr[mid]==1) {
				swap(low,mid,arr);
				mid++;
			}
			else if(arr[mid]==2) {
				swap(mid,high,arr);
				high--;
			}
		}
		return arr;
	}

	public static void swap(int swapIndex1, int swapIndex2, int arr[]) {
		int temp = arr[swapIndex1];
		arr[swapIndex1] = arr[swapIndex2];
		arr[swapIndex2] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 0, 2, 1 };
		int result[] = sort0s1s2sWithoutUsingSortingAlgo(arr);
		for(int x:result)
			System.out.print(" "+x);
	}

}
