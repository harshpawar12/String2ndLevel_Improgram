package StringMostImp2level;
/*
 17. Longest Common Substring  
    Input: `"abcdef", "abfgh"`  
    Output: `"ab"` 
 */
public class longestCommonSubString {
	
	public static void isLongestSub(String s,String s1)
	{
		System.out.println("longest CommonSubstring is:");
		String longest="";
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String t=s.substring(i, j+1);
				
				if(s1.contains(t)) 
				{
					
					if (t.length()>max) {
						max=t.length();
						longest=t;
						
					}
				}
			}
		}
		System.out.println(longest);
	}
	public static void main(String[] args) {
		
		String s="abcdef";//xyzabc", "abcxyz"
		String s1="abfgh";
		isLongestSub(s,s1);
		
		
		
	}

}
