package loopingDay3;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int no=2;String rem="";
   while(no>0){
	   
	   {
		   rem=no%2+rem;
		   no=no/2;
	   }
   }
	   System.out.println(rem);
   
	}
}


