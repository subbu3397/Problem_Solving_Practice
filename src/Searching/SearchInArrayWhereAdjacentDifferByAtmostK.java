package Searching;

public class SearchInArrayWhereAdjacentDifferByAtmostK {

	public static int searchElementInArray(int arr[],int k, int x) {
		
		int itr = 0;
		
		while(itr<arr.length) {
			if(arr[itr]==x)
				return itr;
			
			itr = itr+Math.max(1, Math.abs(arr[itr]-x)/k);
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {20, 40, 50, 70, 70, 60};
		int k =20, x= 60;
		System.out.println("Index "+searchElementInArray(arr,k,x));
	
	}

}
