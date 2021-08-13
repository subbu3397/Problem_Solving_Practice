package Arrays;

public class MinimumMaximumEleInArray {

	public static Pair findMaxandMinElementInArray(int arr[]) {
		int maximumElement = arr[0];
		int minimumElement = arr[0];
		
		for(int itr=1;itr<arr.length;itr++) {
			if(arr[itr]>maximumElement)
				maximumElement = arr[itr];
			if(arr[itr]<minimumElement)
				minimumElement = arr[itr];
		}
		return new Pair(maximumElement,minimumElement);
	}
	
	public static class Pair{
		int maximumElement;
		int minimumElement;
		
		Pair(int maxEle,int minEle){
			this.maximumElement = maxEle;
			this.minimumElement = minEle;
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		Pair pair = findMaxandMinElementInArray(arr);
		System.out.println("Max"+pair.maximumElement+" "+"Min"+pair.minimumElement);
		
	}

}
