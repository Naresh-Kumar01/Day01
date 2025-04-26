package array;

import java.util.Scanner;

/*// Array is a collection of a similar type of data.array is working of a indexing . indexing always start with 0
//Array is allocate a memory as static 
/// syntax-
///Datatype[] variablename=newdatatype[size of array];
Datatype[] variablename={v1,v2,v3   };

*/
public class Array_Collection {
	public void lifo_demo()
	{
		int []arr=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("lifo.....");
		for(int k=4;k>=0;k--)
		{
			System.out.println(arr[k]);
		}
	}
	
	public static void main(String[] args) {
		Array_Collection ob=new Array_Collection();
		ob.lifo_demo();
		
	}

}
