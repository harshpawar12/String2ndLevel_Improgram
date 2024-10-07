package StringMostImp2level;
/*
 6. Word Break Problem  
   Given a string `s` and a dictionary of words `wordDict`, write a method to check if `s` can be segmented into a sequence of words.  
   Example:  
   Input: `s = "leetcode"`, `wordDict = ["leet", "code"]`  
   Output: `true`

 */
public class wordBrakedown {
	
	public static void ischeck(String s,String s1[])
	{
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s1[i].contains(s))
				{
					System.out.println(s1[i].charAt(i));
				}
			}
		}
	}
	public static void main(String[] args) {
		
		String s="leetcode";
		String s1[]= {"leet","code"};
		ischeck(s,s1);
		
	}

}
