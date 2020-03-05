package oopsconcepts;

public class School {
static	void teacher(double a)
	{
	int age=31;
	float hight=5.6f;
	System.out.println(age);
	System.out.println(a);
	System.out.println(hight);
		
	}
	void teacher(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		School s=new School();
		s.teacher(9.8);
		School s1=new School();
		s1.teacher(9);
}

}
