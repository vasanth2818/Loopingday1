package loopingDay3;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 12345, sum;
		do {
			sum = 0;
			while (no > 0) {
				int rem = no % 10;
				sum = sum + rem;
				no = no / 10;

			}
			no = sum;
		} while (sum > 9);
		System.out.println(sum);
	}

}
