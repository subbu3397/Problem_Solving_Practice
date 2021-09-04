package Searching;

import java.util.Arrays;

public class FindPairsWithGivenDiff {

	//T.C:O(N log N) and S.C:O(1)
	public static boolean findPair(int arr[],int size,int n) {
		
		Arrays.sort(arr);
		int itr1 = 0, itr2 = 1;
		while(itr1<size && itr2<size) {
			
			if((itr1 != itr2) && (((arr[itr2]-arr[itr1])==n) || ((arr[itr1]-arr[itr2])==n))){
				System.out.println("The Pairs"+ arr[itr1]+" "+arr[itr2]);
				return true;
			}
			else if(arr[itr2]-arr[itr1]<n)
				itr2++;
			else
				itr1++;
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 20, 3, 2, 50, 80}, n = 78;
		findPair(arr,arr.length,n);
	}

}
