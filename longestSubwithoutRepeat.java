package StringMostImp2level;
/*
 14. Longest Substring Without Repeating Characters  
    Write a Java method to find the length of the longest substring without repeating characters.  
    Example:  
    Input: `"abcabcbb"`  
    Output: `3` (The answer is `"abc"`, with a length of 3).

 */
public class longestSubwithoutRepeat {
	
	
	public static void islongestWithout(String s)
	{
		String st="";
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String t=s.substring(i, j+1);
				int c=0;
				for(int k=0;k<t.length();k++)
				{
					for(int l=k+1;l<t.length();l++)
					{
						if(t.charAt(k)==t.charAt(l))
						{
							c++;
						}
					}
				}
				if(c==0)
				{
					if(t.length()>max)
					{
						max=t.length();
						st=t;
					}
				}
			}
		}
		System.out.println(st);
	}
	public static void main(String[] args) {
		
		String s="abcabcbb";
		System.out.println(s);
		System.out.println("longest WithoutRepeted Substring:");
		islongestWithout(s);
		
	}

}
