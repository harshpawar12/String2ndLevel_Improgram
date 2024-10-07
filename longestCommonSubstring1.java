package StringMostImp2level;
/*
 7. Longest Common Substring  
   Write a Java method to find the longest common substring between two strings.  
   Example:  
   Input: `"ABABC"`, `"BABCA"`  
   Output: `"BABC"`

 */
public class longestCommonSubstring1 {
	
	
	public static void isLongestCommon(String s,String s1)
	{
		int max=0;
		String store="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String t=s.substring(i,j+1);
				
				if(s1.contains(t))
				{
					if(t.length()>max)
					{
						max=t.length();
						store=t;
					}
				}
			}
		}
		System.out.println("longest common substring:");
		System.out.println(store);
	}
	public static void main(String[] args) {
		
		String s="ABABC";
		System.out.println(s);
		String s1="BABCA";
		System.out.println(s1);
		System.out.println("---------------");
		isLongestCommon(s,s1);
		
	}

}
