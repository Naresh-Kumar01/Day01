package array;

import java.util.Scanner;

public class CountCharacterString {
	public static void main(String[] args) {
		CountCharacterString ob=new CountCharacterString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the message");
		String message=sc.nextLine();
		ob.getverify(message);
		
	}

	public  void getverify(String message) {
		int count=0;
		for(int i=0;i<message.length();i++)
		{
			if(message.charAt(i)!=' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
