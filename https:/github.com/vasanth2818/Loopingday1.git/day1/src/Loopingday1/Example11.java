package Loopingday1;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i=1;
   while(i<=50)                  //multiplication of 3 and 5
   {
	   if(i%3==0)     //if(i%3==0)&&(i%5==0) another method 
	   {              //if(i%3==0)!!(i%5==0) same method and  different use in OR operator
		   if(i%5==0)                   // and different output     
		   {
			   System.out.println(i);
			  
		   }
	   }
	   i++;
   }
	}

}
