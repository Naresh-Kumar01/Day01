package array;


public class FibonacciSeriesUsingforLoop {
	
	public static void main(String[] args) {
		int n=10, firstTerm=0,secondTerm=1;
		FibonacciSeriesUsingforLoop ob=new FibonacciSeriesUsingforLoop();
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
