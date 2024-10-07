package StringMostImp2level;

import codenerapractice.returnsecondmost;

/*
 
 14. Replace Spaces with %20  
    Input: `"Mr John Smith"`  
    Output: `"Mr%20John%20Smith"`

  
 */
public class ReplaceSpaces {
	
	public static String isReplace(String s)
	{
		return s.replace(" ","%20");
	}
	public static void main(String[] args) {
		String s="Mr John Smith";
		System.out.print(isReplace(s));
		
		
	}

}
