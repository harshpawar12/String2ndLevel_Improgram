package StringMostImp2level;

import codenerapractice.returnsecondmost;

/*
 
 4. Longest Palindromic Substring  
   Input: `"babad"`  
   Output: `"bab"` (or `"aba"`)
 
  
 */
public class longestPellSubstring {
	
	public static String islongstpell(String s)
	{
		
		String g="";
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=i+1;j<s.length();j++)
			{
				StringBuilder sb=new StringBuilder(s.substring(i, j));
				sb.reverse();
				if(sb.toString().equals(s.substring(i, j)))
				{
					if(sb.length()>max)
					{
						max=sb.length();
						
						g=sb+"";
						
					}
				}
			}
		}
		
		return g;
	}
	public static void main(String[] args) {
		
		String s="babad";
		System.out.println(islongstpell(s));
		
	}

}
