package Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

//T.C: O(n log k) S.C : O(k)
public class KthSmallestLargestElementInArray {

	public static int findKthSmallestElement(int arr[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		//O(n) in worst case to build heap i.e when k equals array size
		for(int itr=0;itr<k;itr++) {
			pq.add(arr[itr]);
		}
		
		
		//O((n-k) log k) to remove the elements and insert, we can ignore n-k it happens very rarely so it will be log k
		for(int itr=k;itr<arr.length;itr++) {
			if(arr[itr]<pq.peek()) {
				pq.poll();
				pq.add(arr[itr]);
			}
		}
		return pq.peek();
	}
	
	public static int findKthLargestElement(int arr[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int itr=0;itr<k;itr++) {
			pq.add(arr[itr]);
		}
		
		for(int itr=k;itr<arr.length;itr++) {
			if(arr[itr]>pq.peek()) {
				pq.poll();
				pq.add(arr[itr]);
			}
		}
		return pq.peek();
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 10, 4, 3, 11, 7, 6, 9 };
		int k = 3;
		System.out.println("The Kth Smallest element is "+findKthSmallestElement(arr,k));
		System.out.println("The Kth Largest element is "+findKthLargestElement(arr,k));

	}

}
