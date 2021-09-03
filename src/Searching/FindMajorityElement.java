package Searching;

public class FindMajorityElement {

	//T.C: O(N) and S.C:O(1)
	//Verify Algorithm Documents for Clear understanding
	public static int findMajorityElement(int arr[], int size) {

		int majorityElement = arr[0];
		int count = 1;
		for (int itr = 1; itr < size; itr++) {

			if (majorityElement != arr[itr]) {
				count--;
			} else {
				count++;
			}
			
			if(count==0) {
				majorityElement = arr[itr];
				count++;
			}
		}
		
		return majorityElement;
	}
	
	public static boolean isMajorityElement(int arr[],int size,int majorityElement) {
		
		int count = size/2;
		int majorityElementCount = 0;
		for(int itr=0;itr<size;itr++) {
			if(arr[itr]==majorityElement) {
				majorityElementCount++;
			}
		}
		if(majorityElementCount>=count)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		int arr[] = {  3, 3, 3, 2 };
		int size = arr.length;
		int majorityElement = findMajorityElement(arr,size);
		System.out.println("Majority Element "+ isMajorityElement(arr, size, majorityElement));
	}

}
