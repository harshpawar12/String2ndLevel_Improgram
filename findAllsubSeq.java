package StringMostImp2level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 3. Find All Subsequences  
   Input: `"abc"`  
   Output: `["", "a", "b", "c", "ab", "ac", "bc", "abc"]`


 */
public class findAllsubSeq {
	
	public static void issubseq(String s)
	{
		List<String>al=new ArrayList<String>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				int sum=0;
				String t=s.subSequence(i, j+1)+"";
				al.add(t);
				
				
			}
		}
	
		//Collections.sort(al);
		System.out.println(al);
	}
	public static void main(String[] args) {
		
		String s="abc";
		issubseq(s);
		
	}

}
