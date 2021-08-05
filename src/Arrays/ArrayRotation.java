package Arrays;

//Rotate the array by d spaces
//I/P:1,2,3,4,5,6,7
//O/P:3,4,5,6,7,1,2
public class ArrayRotation {

	// Method1 Using extra spaces.
	//T.C:O(n) and S.C:O(d)
	public static int[] arrayRotation1(int inputArr[], int d) {
		int tempArr[] = new int[d];
		//O(d)
		for (int itr = 0; itr < d; itr++) {
			tempArr[itr] = inputArr[itr];
		}
		//O(n-d)
		for (int itr = 0; itr < inputArr.length-d; itr++) {
			inputArr[itr]=inputArr[itr+d];
		}
		//O(d)
		for(int itr=inputArr.length-d, temp=0;itr<inputArr.length;itr++) {
			inputArr[itr]=tempArr[temp++];
		}
		return inputArr;
	}

	//Method 2 By rotating only first element of array
	//T.C:O(n*d) and S.C:O(1)
	public static int[] arrayRotation2(int inputArr[], int d) {
		//T.C:O(d)
		for(int itr=0;itr<d;itr++) {
			rotate(inputArr,inputArr.length);
		}
		return inputArr;
	}
	
	//T.C:O(n)
	public static void rotate(int inputArr[],int arraySize) {
		//1st iteration
		//temp = 1
		int temp = inputArr[0];
		for(int itr=0;itr<arraySize-1;itr++) {
			inputArr[itr] = inputArr[itr+1];
		}//inputArr:2,3,4,5,6,7,7
		inputArr[arraySize-1]=temp;//inputArr:2,3,4,5,6,7,1
	}
	
	//Method 3: 1st Step Rotate first d elements in array
	//			2nd Step Rotate n-d elements in array
	//			3rd Step Rotate n elements in array
	
	//T.C:O(n)
	public static int[] arrayRotation3(int inputArray[],int d) {
		if(d==0)
			return inputArray;
		// in case the rotating factor is
        // greater than array length
		d = d%inputArray.length;
		reverseArray(inputArray,0,d-1);
		reverseArray(inputArray,d,inputArray.length-1);
		reverseArray(inputArray,0,inputArray.length-1);
		return inputArray;
	}
	
	//Reversing the array
	private static void reverseArray(int[] inputArray, int start, int end) {
		
		while(start<end) {
			int temp = inputArray[start];
			inputArray[start] = inputArray[end];
			inputArray[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int inputArr[] = {1,2,3,4,5,6,7};
		int d = 2;
		int result[] = arrayRotation1(inputArr,d);
		for(int itr:result) {
			System.out.print(itr+" ");
		}
		System.out.println();
		int inputArr2[] = {1,2,3,4,5,6,7};
		int result2[] = arrayRotation2(inputArr2,d);
		for(int itr:result2) {
			System.out.print(itr+" ");
		}
		
		System.out.println();
		int inputArr3[] = {1,2,3,4,5,6,7};
		int result3[] = arrayRotation3(inputArr3,d);
		for(int itr:result3) {
			System.out.print(itr+" ");
		}

	}

}
