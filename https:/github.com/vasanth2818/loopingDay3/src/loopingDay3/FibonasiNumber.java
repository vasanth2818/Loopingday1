package loopingDay3;

public class FibonasiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int first=0;
   int second=1;
   System.out.println(first);
   System.out.println(second);        
   for(int i=2;i<=10;i++)
   {
	   int third=first+second;
	   System.out.println(third);
	   first=second;
	   second=third;
   }
	}

}
