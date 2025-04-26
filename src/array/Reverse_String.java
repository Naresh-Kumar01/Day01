package array;

import java.util.Scanner;

//Reverse string
//string 

public class Reverse_String
{
	String rev="";
	
	
	
 public void get_string()
 {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("please enter the input");
	 String input=sc.next();
	 char []c=input.toCharArray();  // to chararray method
	  for (int k=c.length-1;k>=0;k--)
	 {
		 rev=rev+c[k];
	 }
	 
	 System.out.println(rev);
 }
 
 public static void main(String[] args) {
	 Reverse_String ob =new Reverse_String();
	 ob.get_string();
	
}
	
}
