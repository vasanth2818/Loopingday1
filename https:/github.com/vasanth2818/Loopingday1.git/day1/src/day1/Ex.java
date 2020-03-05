package day1;

abstract class Ex {
	

	public static void main(String[] args) {
		try
		{
			int a=5/0;	
		}
		catch(ArithmeticException a)
		{
			System.out.println("Arithmetic");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
		
				

	}
	

}
