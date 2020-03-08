package String;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pwd=" ";
		char ch[]=pwd.toCharArray();
		int nocount=0,capcount=0;
		if(ch.length<8)
		{
			System.out.println("Not valid number");
		}
		else
		{//Number present or not
			for(int i=0;i<ch.length;i++)
			{
				if((ch[i]>=48)&&(ch[i]<=57))
				{
					nocount++;
					
				}//capital letter present
				else if((ch[i]>=65)&&(ch[i]<=91))
				{
					capcount++;
				}
			}

	}

		
	}

}
