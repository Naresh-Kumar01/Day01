package array;

import java.util.Scanner;

public class Sumdemo {
	public void getsum()
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the 5 input");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for (int k=0;k<=4;k++)
		{
			sum=sum+a[k];
		}
		System.out.println("total array sum value is :"+sum);
	}
 public static void main(String[] args) {
	 Sumdemo ob=new Sumdemo();
	 ob.getsum();
	
}
}
