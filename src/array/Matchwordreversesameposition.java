package array;

import java.util.Scanner;

public class Matchwordreversesameposition {
	public void reverse_sameposition(String input,String input1)
	{
		int f=0;
		String []s=input.split(" ");
		for(int i=0;i<=s.length-1;i++)
		{
			if(s[i].equals(input1))
			{
				f=1;
			}
			else
			{
				System.out.println("not match");
			}
		}
	}
	public static void main(String[] args) {
		Matchwordreversesameposition ob=new Matchwordreversesameposition();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the input");
		String input =sc.nextLine();
		System.out.println("please enter the input1");
		String input1=sc.next();
		ob.reverse_sameposition(input, input1);
				
		
	}

}
