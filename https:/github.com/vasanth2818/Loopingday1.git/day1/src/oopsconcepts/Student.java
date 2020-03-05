package oopsconcepts;

public class Student {
	static  String name="Vasanth";
	static int  rollnum=89;
      
    void print( )
	{
		int x=89;
		System.out.println(x);
	
	}
	void display(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	void setvalue()
	{
	int	x=16;
	System.out.println(x);
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.print();
		s.display(4,6);
		s.setvalue();
		System.out.println(name);
		System.out.println(rollnum);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
