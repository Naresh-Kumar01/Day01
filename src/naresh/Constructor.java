package naresh;
// Constructor is a special type of method there are three type of construtor default parameterized 
// copy consrtuctor
public class Constructor{
	static int a=10; static String b="default";String c;
	
	Constructor()
	{  
		
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		Constructor c= new Constructor();
		Parameterized_Constructor pc=new Parameterized_Constructor(a,"constructor");
		Copy_constructor copy=new Copy_constructor(a,b); 
	}
}

 class Parameterized_Constructor{
	 String c="constructor";
	 Parameterized_Constructor(int a,String c)
	 {
		
		 System.out.println(a+" "+c);
	 }
}
 class Copy_constructor{
	  public Copy_constructor(int a, String b) {
		
	 }
 }

	
 



