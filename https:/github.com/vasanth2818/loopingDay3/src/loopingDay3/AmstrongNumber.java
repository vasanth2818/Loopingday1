package loopingDay3;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 153, rem;
		int Arm = 0;
		int no1 = no;
		while (no > 0) 
		{
			rem = no % 10;
			Arm = Arm + (rem * rem * rem);
			no = no / 10;
		}
		if (no1 == Arm) 
		{
			System.out.println("the number is Amstrong");

		} else 
		{
			System.out.println("the number is not Amstrong");
		}

	}

}
