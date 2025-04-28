package array;

import java.util.Scanner;

public class EvenPositionChange {
	public void get_change(String input)
	{
		String out="";
		String[] s=input.split(" ");
		
		{
			for(int i=0;i<=s.length-1;i++)
			{
				if(s[i].length()%2==0)
				{
					char []c=s[i].toCharArray();
					for(int j=c.length-1;j>=0;j--)
					{
						out=out+c[j];
					}
				}
				else
				{
					out=out+s[i];
				}
				out=out+" ";
			}
			
		}
		
			
	System.out.println(out);	
		
	}
	public static void main(String[] args) {
		EvenPositionChange ob=new EvenPositionChange();
		Scanner sc=new Scanner(System.in);
		System.out.println("Plaese enter the word");
		String input =sc.nextLine();
		ob.get_change(input);
		
	}

}
