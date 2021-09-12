package Searching;


//T.C:O(log N)
public class SearchElementInSortedRotatedArray {

	//The main idea is we need to find some part of array which is sorted so that we can apply binary search on that part
	//Then determin whether the target is present in that part
	public static int searchInRotatedSortedArray(int arr[],int target) {
		int size = arr.length-1;
		
		int low=0,high = size;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==target)
				return mid;
			//If mid is greater than or equal to left means this part is strictly increasing(Sorted part)
			else if(arr[low]<=arr[mid]) {
				//Check if the target is present in this part if yes make the high = mid -1 and search in this part 
				if(arr[low] <= target && target<arr[mid])
					high = mid-1;
				//else make low = mid+1 and check in that part
				else
					low = mid+1;
			}
			//If mid is less than high means this part is strictly increasing(sorted part)
			else {
				//Check if the target is present in this part. If yes inc low = mid+1
				if(arr[mid] < target && target<=arr[high]) {
					low = mid+1;
				}
				else
					high = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(searchInRotatedSortedArray(arr,target));
	}

}
