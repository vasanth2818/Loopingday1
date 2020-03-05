package loopingDay3;

public class greatest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 18;
		int no2 = 60;
		int small = no1 < no2 ? no1 : no2;
		while (small >= 2) 
		{
			if ((no1 % small == 0) && (no2 % small == 0)) 
			{
				System.out.println("gcd" + small);
				break;
			}
			small--;
		}

	}
}
