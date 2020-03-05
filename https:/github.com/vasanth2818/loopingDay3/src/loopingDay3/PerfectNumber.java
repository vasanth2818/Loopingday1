package loopingDay3;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int no = 6;
		for (int i = 1; i < no; i++)
		{
			if (no % i == 0) 
			{
				sum = sum + i;

			}
		}
		if (sum == no) 
		{
			System.out.println("this is  perfect number");
		} else 
		{
			System.out.println(" this is not perfect number");
		}
	}
}
