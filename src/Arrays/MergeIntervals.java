package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Pair {
	int start;
	int end;

	Pair(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
//and return an array of the non-overlapping intervals that cover all the intervals in the input.
public class MergeIntervals {

	//T.C:O(N Log(N)) and S.C:O(N)
	public static int[][] mergeIntervals(Pair pairs[]) {

		ArrayList<int[]> result = new ArrayList<>();
		Arrays.sort(pairs, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.start - o2.start;
			}
		});

		int start = pairs[0].start;
		int end = pairs[0].end;
		for (int itr = 1; itr < pairs.length; itr++) {
			if (pairs[itr].start <= end) {
				end = pairs[itr].end;
			} else {
				result.add(new int[] {start,end});
				start = pairs[itr].start;
				end = pairs[itr].end;
			}
		}
		result.add(new int[] {start,end});
		return result.toArray(new int[0][]);
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		Pair[] pairs = new Pair[arr.length];
		for (int itr = 0; itr < arr.length; itr++) {
			pairs[itr] = new Pair(arr[itr][0], arr[itr][1]);
		}
		int result[][] = mergeIntervals(pairs);
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
