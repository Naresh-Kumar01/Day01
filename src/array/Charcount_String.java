package array;
// get the count in given string

import java.util.Scanner;

public class Charcount_String {
	public void getcount(String input,char input1)
	{
		int count=0;
		char []c=input.toCharArray();
		for(int i=0;i<=c.length-1;i++)
		{
			if(c[i]==input1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
 public static void main(String[] args) {
	 Charcount_String ob=new Charcount_String();
	 Scanner sc= new Scanner(System.in);
	 System.out.println("please enter the word");
	 String input =sc.nextLine();
	 System.out.println("please enter the character ");
	 char input1=sc.next().charAt(0);
	 ob.getcount(input, input1);
	
}
}
