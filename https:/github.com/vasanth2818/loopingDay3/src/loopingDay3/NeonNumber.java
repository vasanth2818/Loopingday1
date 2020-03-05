package loopingDay3;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int no = 9;
		int square = no * no;
		while (square > 0) {

			int rem = square % 10;
			sum = sum + rem;
			square = square / 10;
		}
		if (no == sum) 
		{
			System.out.println("the number is Neon");

		} else 
		{
			System.out.println("the number is not Neon");
		}
	}

}
