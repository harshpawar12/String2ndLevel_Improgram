package StringMostImp2level;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 
 11. Scramble String  
    Input: `"great", "rgeat"`  
    Output: `true`


 */
public class ScrambleString {
	
	
	public static boolean isScrambled(String s,String s1)
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
		
		String s="great";
		String s1="rgeat";
		if(isScrambled(s,s1))
			System.out.println("Scarmbled");
		else {
			System.out.println("not scrambled");
		}
		
	}

}
