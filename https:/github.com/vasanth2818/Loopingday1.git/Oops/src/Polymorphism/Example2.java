package Polymorphism;

public class Example2 {
	int a=19;
	float b=9.8f;
	void process()
	{
		System.out.println(a);
		System.out.println(b);
	}
	void upgrade()
	{
		int c=45;
		char d='v';
		System.out.println(c);
		System.out.println(d);
		
	}
	public class Example3 extends Example2
	{
		void process()
		{
			System.out.println(a);
			System.out.println(b);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e=new Example2();
		e.process();
        e.upgrade();
        
	}

}