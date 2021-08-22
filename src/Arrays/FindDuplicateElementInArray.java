package Arrays;

//Find duplicate element in N+1 elements in Array 
public class FindDuplicateElementInArray {

	//T.C:O(N) and S.C:O(1)
	public static int findDuplicateElementInArray(int arr[]) {

		for (int itr = 0; itr < arr.length; itr++) {
			
			//Note it works on index based not array element based.
			//Iterations:
				//1: temp = 1 -> arr[1](3)>=0 true -> arr[1] = -3
				//2: temp = 3 -> arr[3](2)>=0 true -> arr[3] = -2
				//3: temp = 4 -> arr[4](2)>=0 true -> arr[4] = -2
				//4: temp = 2 -> arr[2](4)>=0 true -> arr[2] = -4
				//5: temp = 2 -> arr[2](-4)<0 false returns temp which is 2.
			int temp = Math.abs(arr[itr]);
			if(arr[temp]>=0) {
				arr[temp] =- arr[temp];
			}
			else
				return temp;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 4, 2, 2 };
		System.out.println("Duplicate Value in Array is "+ findDuplicateElementInArray(arr));

	}

}
