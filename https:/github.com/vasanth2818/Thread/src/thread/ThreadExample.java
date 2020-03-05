package thread;

public class ThreadExample  extends Thread
    {
	int a=7;
	public void run()
	{
		System.out.println(a);
	}


	public static void main(String[] args) 
	{
		
		ThreadExample s=new ThreadExample();
		s.a=10;
		s.start();
		ThreadExample s1=new ThreadExample();
		s1.a=15;
		s1.start();
		System.out.println("hello");
		
		
				

	}

}
