package loopingstatement;

public class Factorial {
		void print(int n)
		{
			int i=1,temp=0;
			if(i<=n)
			{
				temp=temp*i;
			i++;
			System.out.println(temp);
			}	
		}
		public  static  void main(String args[])
		{
			Factorial f=new Factorial();
			f.print(5);
			
	}

}
