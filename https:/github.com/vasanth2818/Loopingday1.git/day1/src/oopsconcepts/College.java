package oopsconcepts;

public class College {
	void student()
	{
	float a=5.8f;
	System.out.println(a);
	}
	College()//if we want a constructor java  will not create default constructor
	          //constructor is used to initialize the value
	{
		int b=89;
		float  c=4.5f;
		System.out.println(b);
		System.out.println(c);		
		
	}

	public static void main(String[] args) {
		College c=new College();
		c.student();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
