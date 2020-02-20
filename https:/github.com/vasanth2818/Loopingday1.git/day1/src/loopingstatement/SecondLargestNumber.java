package loopingstatement;

public class SecondLargestNumber {

	public static void main(String[] args) {
	int a[]= {13,14,8,5,19};
	int first=a[0];
	int second=a[0];
	for(int i=0;i<=a.length;i++)
	{
		if(a[i]>first)
		{
			second=first;
			first=a[i];
		}else if(a[i]>second)
		{
			second=a[i];
			
		}
		System.out.println("the first maximum:"+first);
		System.out.println("the second maximum:"+second);
	}

	}

}
