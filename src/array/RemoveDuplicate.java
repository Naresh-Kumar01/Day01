package array;
// Ask Question for co-forge

import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a word");
		String input =sc.nextLine();
		sc.close();
		
		String result=RemoveDuplicates(input);
		System.out.println("after removing duplicates:" +result);
	}

	public static String RemoveDuplicates(String s) {
		boolean [] seen=new boolean[256];
		String result="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!seen[c])
			{
				result+=c;
				seen[c]=true;
			}
		}
		return result;
	}
	
}
