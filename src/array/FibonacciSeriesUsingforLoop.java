package array;

import java.util.Scanner;

public class FibonacciSeriesUsingforLoop {
	
	public static void main(String[] args) {
		int  firstTerm=0,secondTerm=1;
		FibonacciSeriesUsingforLoop ob=new FibonacciSeriesUsingforLoop();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		int n=sc.nextInt();
		System.out.println("Fibonacci Series till "+ n +" Terms :");
		for(int i=1;i<=n;++i)
		{
			System.out.println(firstTerm+" ");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		
	}

}
