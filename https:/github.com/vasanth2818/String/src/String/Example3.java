package String;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="vasanth";
       char alpha[]=s.toCharArray();
       int i=0;
		while(i<alpha.length)
		{
			char ch=alpha[i];
			if(i%2==0) {
			int ch2=(int)ch-32;
			System.out.print((char)ch2);
			}
			else
			{
				int ch2=((int)ch);
						System.out.print((char)ch2);
			}
			i++;
	}

}
}
