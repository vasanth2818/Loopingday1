package loopingstatement;

public class Recurtion {
	int x=1;
	void print()
	{
		System.out.println(x);
		x++;
		if(x<=3) 
			print();
	}

	public static void main(String[] args) {
		Recurtion r=new Recurtion();
				r.print();
				System.out.println("End");
		
		// TODO Auto-generated method stub

	}

}
