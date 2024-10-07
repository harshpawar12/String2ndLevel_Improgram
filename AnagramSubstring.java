package StringMostImp2level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 4. Find All Anagrams of a Substring  
   Given a string `s` and a string `p`, return the start indices of `p`'s anagrams in `s`.  
   Example: `s = "cbaebabacd"`, `p = "abc"` → Output: `[0, 6]`


 */
public class AnagramSubstring {
	
	
	public static void isAnagram(String s,String s1)
	{
		List<Integer>al=new ArrayList();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String t=s.substring(i,j);
				
				if(isValidIndex(s1, t))
				{
					System.out.println(t);
					al.add(i);
				}
			}
		}
		System.out.println(al);
	}
	public static boolean isValidIndex(String s1,String t)
	{
		char ch[]=t.toCharArray();
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch);
		if(Arrays.equals(ch, ch1))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		String s="cbaebabacd";
		System.out.println(s);
		String s1="abc";
		System.out.println(s1);
		System.out.println("-----------");
		isAnagram(s,s1);
		
	}

}
