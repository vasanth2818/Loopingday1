package loopingstatement;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int rem;int temp=0;
	int count=0;
	int temp1=n;
	while(n>0)
	{
		rem=n%10;
		count=(count*10)+rem;
		n=n/10;
		
	}if(temp1==count)
	{
		System.out.println("The number is Palindrome");
	}else
	{
		System.out.println("The number not Palindrome");
	}
	

	}

}
