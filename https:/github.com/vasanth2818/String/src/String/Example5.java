package String;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "9876543210";
		boolean flag = true;
		char ch[] = s.toCharArray();
		if((ch.length == 10)&&(ch[0]!=0))
		{
			for (int i = 0; i < ch.length; i++)
			{
				char c = ch[i];
				int asc = (int) c;
				if (!((asc >= 48) && (asc <= 57)))
				{
					System.out.println("not the mobile number");
					flag = false;
					break;
				}

			}
	
		
	}
		if(flag==true)
		{
			System.out.println("valid number");
		}
}
}
