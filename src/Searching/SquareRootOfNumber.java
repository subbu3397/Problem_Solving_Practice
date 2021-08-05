package Searching;

public class SquareRootOfNumber {

	public static int findSquareRootOfNumber(int number) {
		
		if(number==1 || number ==0)
				return number;
		long start = 1, end = number;
		while (start <= end) {
			int middle = (int) (start + end) / 2;
			if (middle * middle == number)
				return middle;
			if (middle * middle > number) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int number = 49;
		System.out.println("Square root of Number"+findSquareRootOfNumber(number));
	}

}
