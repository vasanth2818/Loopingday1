package inheritance;

public class Examplle {
	String name="Vasanth";
	int rollno=52;
	int age=21;
	void student()
	{
		System.out.println(name);
		System.out.println(rollno);
		
	}
 class teacher extends Examplle

{
	 void stuent1()
	 {
		 System.out.println(age);
		 
	 }
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Examplle e=new Examplle();
	e.student();
	

	
	
	
		

	}

}
