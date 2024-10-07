package StringMostImp2level;
/*
 
 8. Longest Substring Without Repeating Characters  
   Input: `"abcabcbb"`  
   Output: `3` (substring is `"abc"`)

  
 */
public class longestSubStringWithoutRepeat {
	public static String isWithoutRepeat(String s)
	{
		int max=0;
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String t=s.substring(i, j+1);
				int c=0;
				
				//--------------------s
				for(int k=0;k<t.length();k++)
				{
					
					for(int l=k+1;l<t.length();l++)
					{
						if(t.charAt(k)==t.charAt(l))
						{
							c++;
							break;
						}
					}
					
				}
				if(c==0)
				{
					if(t.length()>max)
					{
						max=t.length();
						s1=t;
					
					}
				}
				
				//--------------------
				
				
				
			}
		}
		
		return s1;
	}
	public static void main(String[] args) {
		
		String s="abcabcbb";
		System.out.println(isWithoutRepeat(s));;
		
	}

}
