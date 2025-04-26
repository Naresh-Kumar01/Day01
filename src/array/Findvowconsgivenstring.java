package array;

import java.util.Scanner;

public class Findvowconsgivenstring {
	public void getverify()
	{
		int vow=0; int cons=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the input");
		String input=sc.next();
		char []c=input.toCharArray();
		for (int i=0;i<=c.length-1;i++)
		{
			if (c[i]=='a'|c[i]=='e'|c[i]=='i'|c[i]=='o'|c[i]=='u')
			{
				System.out.println("vowel");
				vow++;
			}
			else
			{
				System.out.println("consonant");
				cons++;
			}
		}
		System.out.println(vow);
		System.out.println(cons);
	}
	
	public static void main(String[] args) {
		Findvowconsgivenstring ob=new Findvowconsgivenstring ();
		ob.getverify();
		
	}

}
