package String;

public class RepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sarvesh";
		for(int j=0;j<str.length();j++)
		{
			boolean repeat=false;
		    char c1=str.charAt(j);
		    for(int i=1;i<str.length();i++)
		    {
		    	if(c1==str.charAt(i))
		    	{
		    		repeat=true;
		    	}
		    }
		    		    if(repeat==false)
		    {
		    	System.out.println(c1+" First non repeat char");
		    }
		}
		
		

	}

}
