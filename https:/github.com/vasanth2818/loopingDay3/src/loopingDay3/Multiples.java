package loopingDay3;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 2;
		int no2 = 2;
		int big = no1 > no2 ? no1 : no2;
		int small = no1 < no2 ? no1 : no2;
		while (true) 
		{
			if (big % small == 0) {
				System.out.println(big);
				break;
			}
			big += big;
		}

	}
}
