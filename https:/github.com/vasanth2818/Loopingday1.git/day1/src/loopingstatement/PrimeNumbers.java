package loopingstatement;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int count=0;
			for(int i=1;i<10;i++)
			{
				if(n%i==0)
					{
					count++;	
					}
				
			}
				if(count==2)
				{
					System.out.println("The number is prime");
				}else
				{
					System.out.println("The number is not prime");
				}
		}

	}


