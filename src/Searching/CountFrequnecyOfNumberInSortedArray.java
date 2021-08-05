package Searching;

public class CountFrequnecyOfNumberInSortedArray {

	public static int frequencyOfNumberInArray(int arr[], int numberToSearch) {
		int start = 0;
		int n = arr.length - 1;
		int end = n;

		int firstOccurenceIndex, lastOccurenceIndex;

		firstOccurenceIndex = firstOccurenceIndex(arr, numberToSearch, start, end);
		
		if(firstOccurenceIndex==-1)
			return -1;
		
		lastOccurenceIndex = lastOccurenceIndex(arr, numberToSearch, firstOccurenceIndex, end);
		
		return lastOccurenceIndex-firstOccurenceIndex+1;

	}

	public static int firstOccurenceIndex(int arr[], int numberToSearch, int start, int end) {

		while (start <= end) {
			int middle = (start + end) / 2;
			if ((middle == 0 || arr[middle - 1] < numberToSearch) && arr[middle] == numberToSearch)
				return middle;
			else if (arr[middle] < numberToSearch)
				return firstOccurenceIndex(arr, numberToSearch, middle + 1, end);
			else
				return firstOccurenceIndex(arr, numberToSearch, start, middle - 1);

		}
		return -1;
	}

	public static int lastOccurenceIndex(int arr[], int numberToSearch, int start, int end) {

		while (start <= end) {
			int middle = (start + end) / 2;
			if ((middle == arr.length-1 || arr[middle + 1] > numberToSearch) && arr[middle] == numberToSearch)
				return middle;
			else if (arr[middle]>numberToSearch)
				return lastOccurenceIndex(arr, numberToSearch, start, middle - 1);
			else
				return lastOccurenceIndex(arr, numberToSearch, middle+1, end);

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 4, 5 };
		int x = 4;
		System.out.println("Frequency of Number In Array" + frequencyOfNumberInArray(arr, x));
	}

}
