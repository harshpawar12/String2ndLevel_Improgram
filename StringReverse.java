package StringMostImp2level;

/*
 
 
1. Reverse a String  
   Input: `"Hello World"`  
   Output: `"World Hello"`

 
 
 */
public class StringReverse {
	
	public static void isReverse(String s)
	{
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		
		String s="Hello World";
		isReverse(s);
		
	}

}
