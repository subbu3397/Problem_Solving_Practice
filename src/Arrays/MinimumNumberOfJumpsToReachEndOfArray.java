package Arrays;

public class MinimumNumberOfJumpsToReachEndOfArray {

	//T.C:O(N)
	private static int findMinimumNumberOfJumps(int[] arr) {
		// TODO Auto-generated method stub
		int jump=0,end=0,farthest=0;
		//We no need to check the last element jump so arr.length-1
		for(int itr = 0;itr<arr.length-1;itr++) {
			farthest = Math.max(farthest,itr+arr[itr]); //Why itr+arr[itr] because you need to calculate from that index how many jumps you can do.
			//If it reaches the farthest jump from that particular step inc jump and change the end value with the farthest step.
			if(itr==end) {
				jump++;
				end = farthest;
			}
		}
		return jump;
		
	}
	public static void main(String[] args) {
		int arr[] = {2,3,1,1,4};
		System.out.println("Minimum Number Of Jumps "+findMinimumNumberOfJumps(arr));
		
	}

	

}
