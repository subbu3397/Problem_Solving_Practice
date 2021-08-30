package Arrays;

public class BuyAndSellStock {

	//T.C:O(n) and S.C:O(1)
	public static int maximumProfit(int arr[]) {
		int minmalPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int itr=0;itr<arr.length;itr++) {
			minmalPrice = Math.min(minmalPrice,arr[itr]);
			maxProfit = Math.max(maxProfit, arr[itr]-minmalPrice);
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		System.out.println("Max Profit"+maximumProfit(arr));
	}

}
