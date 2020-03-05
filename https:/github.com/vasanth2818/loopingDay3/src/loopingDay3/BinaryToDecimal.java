package loopingDay3;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 1001, power = 0, dec = 0;
		int rem;
		while (no > 0) 
		{
			rem = no % 10;
			dec = dec + (int) (rem * Math.pow(2, power));
			no = no / 10;
			power++;

		}
		System.out.println(dec);
	}

}
