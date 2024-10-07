package StringMostImp2level;

import java.util.Arrays;

import codenerapractice.returnsecondmost;

/*
 16. Check Valid Shuffle  
    Input: `"abc", "def", "dabecf"`  
    Output: `true`
*/
public class validShuffle {
	
	public static boolean isValidShuffle(String s,String s1,String s2)
	{
		char ch1[]=s2.toCharArray();
		Arrays.sort(ch1);
		s=s.concat(s1);
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		if(Arrays.equals(ch, ch1))
		{
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		
		String s="abc";
		String s1="def";
		String s2="defabc";
		if(isValidShuffle(s,s1,s2))
			System.out.println("true");
		else
			System.out.println("false");
		
	}

}
