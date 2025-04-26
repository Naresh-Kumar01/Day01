package array;

import java.util.Scanner;

public class Palindrom {
	String p="";
	
	public void get_verify() {
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the message");
		String message=sc.next();
		char []c=message.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			p=p+c[i];
		}
		if(message.endsWith(p))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrom");
		}
		
	}
	public static void main(String[] args) {
		Palindrom ob=new Palindrom();
		ob.get_verify();
	}

}
