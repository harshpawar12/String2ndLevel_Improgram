package StringMostImp2level;

import java.util.Arrays;

/*
 
 2. Anagram Check  
   Input: `"listen", "silent"`  
   Output: `true`

  
 */
public class AnagramString {
	
	public static boolean isAnagram(String s,String s1)
	{
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch, ch1))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		String s="listen";
		String s1="silent";
		if(isAnagram(s,s1))
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("not Anagram");
		}
	}

}
