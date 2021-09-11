package Searching;

import java.util.ArrayList;
import java.util.Arrays;

//Bishu went to fight for Coding Club. There were N soldiers with various powers. 
//There will be Q rounds to fight and in each round, Bishu's power will be varied. 
//With power M, Bishu can kill all the soldiers whose power is less than or equal to M(<=M). After each round, 
//All the soldiers who are dead in the previous round will reborn. Such that in each round there will be N soldiers to fight. 
//As Bishu is weak in mathematics, help him to count the number of soldiers that he can kill in each round and the total sum of their powers.

//Input
//The first line of the input contains N, the number of soldiers.
//The second line contains an array of N numbers denoting the power of each soldier
//This third line contains Q, which denotes the number of rounds.
//Q lines follow, each line having one number denoting the power of Bishu.

//Output:
//For each round, the output should be an array of two numbers. 
//The first number should be the number of soldiers that Bishu can beat,
//and the second number denotes the cumulative strength of all the soldiers that Bishu can beat.

//Sample Input
//7
//1 2 3 4 5 6 7
//3
//3
//10
//2

//Sample Output
//3 6
//7 28
//2 3
public class BishuAndSoldiers {

	public static void main(String[] args) {
		int numberOfSoldiers = 7;
		int soldiersPower[] = { 1, 2, 3, 4, 5, 6, 7 };
		int numberOfRounds = 3;
		ArrayList<Integer> bishuPower = new ArrayList<>(Arrays.asList(3, 10, 2));
		findNumberOfEnemiesAndTotalPower(soldiersPower,numberOfSoldiers,numberOfRounds,bishuPower);

	}
	
	//T.C:O(N log N)
	public static void findNumberOfEnemiesAndTotalPower(int soldiersPower[], int numberOfSoldiers, int numberOfRounds,
			ArrayList<Integer> bishuPower) {
		
		//O(N log N)
		Arrays.sort(soldiersPower);
		//Calculate the prevSum Array which is index-1 Based Array(starts from index 1) for total soldiers power.
		int prevSumArr[] = new int[numberOfSoldiers + 1];
		prevSumArr[0] = 0;
		//O(N)
		for (int itr = 1; itr <= numberOfSoldiers; itr++) {
			prevSumArr[itr] = prevSumArr[itr - 1] + soldiersPower[itr - 1];
		}
		
		//Iterate the bishu current power and get is upper limit and compute the number of enemies and total soldiers power based on it.
		for (int itr = 0; itr < numberOfRounds; itr++) {
			int bishucurrentPower = bishuPower.get(itr);
			int index = upperBound(soldiersPower, 0, numberOfSoldiers, bishucurrentPower);
			System.out.println(index + " " + prevSumArr[index]);
		}
	}

	//O(Log N)
	static int upperBound(int[] a, int low, int high, int element) {
		while (low < high) {
			int middle = low + (high - low) / 2;
			if (a[middle] > element) {
				high = middle;
			} else {
				low = middle + 1;
			}
		}
		return low;
	}
}
