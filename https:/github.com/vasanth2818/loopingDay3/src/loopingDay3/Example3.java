package loopingDay3;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;
		   int second=1;  int count=0;                      
		   System.out.println(first);
		   System.out.println(second);
		   for(int i=2;i<=10;i++)
		   {
			   second=first+second;
			   first=second-first;
			   System.out.println(second);
	}

}
}

