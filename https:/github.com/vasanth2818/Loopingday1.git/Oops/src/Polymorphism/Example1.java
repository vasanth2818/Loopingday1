package Polymorphism;

public class Example1 {// more than one method can have same name different arguments
	void school(int a)// called as method overloading
	{
		System.out.println(a);
	}

	void school(float a) 
	{
		System.out.println(a);
	}

	Example1(double a)
	{
		System.out.println(a);
	}

	Example1() 
	{ 
		int a = 10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e = new Example1(8.9);
		e.school(7);
		e.school(6.7f);
		Example1 e1 = new Example1();
	}

}
