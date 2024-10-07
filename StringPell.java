package StringMostImp2level;

import codenerapractice.returnsecondmost;

/*
 
 3. Palindrome Check  
   Input: `"madam"`  
   Output: `true`

 
 
 */
public class StringPell {
	public static boolean isPell(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=s.charAt(i);
		}
		if(s.equals(s1))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		String s="madam";
		
		if(isPell(s))
			System.out.println("pellindrom");
		else
			System.out.println("Not pellindrom");
	}
}
