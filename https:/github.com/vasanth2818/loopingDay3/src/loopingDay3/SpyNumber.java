package loopingDay3;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 1124, sum;
		int prod = 1;
		sum = 0;
		while (no > 0) {
			int rem = no % 10;
			sum = sum + rem;
			prod = prod * rem;
			no = no / 10;

		}
		System.out.println(sum);
		System.out.println(prod);
	}
}
