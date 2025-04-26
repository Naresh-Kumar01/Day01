package array;

import java.util.Scanner;

public class vowel_cons_count {
	int k=0; int vow=0;int con=0;
	char [] arry=new char[5];
	Scanner sc =new Scanner(System.in);
	
	public void getverifycount()
	{
		System.out.println("please enter the 5 charcter");
		
		for ( k=0;k<=4;k++)
		{
			arry[k]=sc.next().charAt(0);
		}
		
		for( int j=0;j<=4;j++)
		{
			if(arry[j]=='a'|arry[j]=='e'|arry[j]=='i'|arry[j]=='o'|arry[j]=='u')
			{
				System.out.println( "vowel");
				vow++;
			}
			else {
				System.out.println("consonant");
				con++;
			}
		}
		System.out.println(vow++);
		System.out.println(con++);
		
		
	}
	
	public static void main(String[] args) {
		vowel_cons_count ob=new vowel_cons_count();
		ob.getverifycount();
		
		
	}

}
