package Loopingday1;

public class Example1 {//swapping two variable
	void exercise()
	{
		int a=5;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Example1 e=new Example1();
		e.exercise();
		
		
		// TODO Auto-generated method stub

	}
}
