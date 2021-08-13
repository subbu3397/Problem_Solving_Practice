package Arrays;

public class MoveAllNegativeIntegersToOneSideOfArray {

	public static int[] moveAllIntegersToOneSide(int arr[]) {
		
		int left = 0,right=arr.length-1;
		while(left<right) {
			
			if(arr[left]<0 && arr[right]<0) {
				left++;
			}
			else if(arr[left]>0 && arr[right]<0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			else if(arr[left]<0 && arr[right]>0) {
				left++;
			}
			else {
				right--;
			}
		}
		
		return arr;
		
	}
	public static void main(String[] args) {
		int arr[] = {1,-11,-12,2,3,-4,-5,6,7,8,-1,-6,-7,9};
		int result[] = moveAllIntegersToOneSide(arr);
		for(int x:result)
			System.out.print(" "+ x);
	}

}
