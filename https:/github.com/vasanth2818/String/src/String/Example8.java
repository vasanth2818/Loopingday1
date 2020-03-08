package String;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="Welcome to tamilnadu.vanakam thala !";
  int count=0;
  for(int i=0;i<str.length();i++)
  {
	  if(str.charAt(i)=='.')
	  {
		  count++;
	  }
  
  if(str.charAt(i)==' ')
  {
	char c=(char) (str.charAt(i+1)-32);
	int j=(int)c-32;
	c=(char)i;
	
  }
  }
  System.out.println(count+1);
	}

}
