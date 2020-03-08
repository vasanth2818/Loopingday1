package String;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="VASANTH";
  char ch[]=s.toCharArray();
  for(int i=0;i<ch.length;i++)
  {
	  char c=ch[i];
	  int asc=(int)c;
	  if((asc>=65)&&(asc<=91))
	  {
		  System.out.println((char)(asc+32));
	  }
	  else if((asc>=97)&&(asc<=122))
	  {
		  System.out.println((char)(asc-32));
	  }
  }
	}

}
