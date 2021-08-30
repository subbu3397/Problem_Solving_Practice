package Arrays;

public class CountInversions {

	public static int mergeSort(int array[]) {
		int helper[] = new int[array.length];
		return mergeSort(array,helper,0,array.length-1);
	}
	
	public static int mergeSort(int array[],int helper[],int low,int high) {
		int inversionCount = 0;
		if(low<high) {
			int middle = (low+high)/2;
			inversionCount+=mergeSort(array,helper,low,middle);//sort left half
			inversionCount+=mergeSort(array,helper,middle+1,high);//sort right half
			inversionCount+=countInversions(array,helper,low,middle,high);// merge them
		} 
		return inversionCount;
	}
	
	public static int countInversions(int array[],int helper[],int low,int middle,int high) {
		
		int inversionCount = 0;
		
		for(int i=low;i<=high;i++) {
			helper[i] = array[i];
		}
		
		int left = low;
		int right = middle+1;
		int current = low;
		
		/* Iterate through helper array. Compare the left and right half, copying back
		* the smaller element from the two halves into the original array. */
		while(left<=middle && right <= high) {
			if(helper[left] <= helper[right]) {
				array[current] = helper[left];
				left++;
			}else { //If right element is smaller than left element
				array[current] = helper[right];
				inversionCount += (middle-left+1);
				right++;
			}
			current++;
		}
		//Copy the rest of the left side of the array into the target array
		int remaining = middle - left;
		for(int i=0;i<=remaining;i++) {
			array[current + i] = helper[left+i];
		}
		
		return inversionCount;
	}
	public static void main(String[] args) {
		
		int arr[] = {1, 9, 6, 4, 5 };
		System.out.println(mergeSort(arr));
	}

}
