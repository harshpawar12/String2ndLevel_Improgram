package StringMostImp2level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 19. Find Kth Largest Substring  
    Input: `"abc", k=4`  
    Output: `"ab"`

 */
public class KthLargestSubstring {
	
	public static void isKthLargest(String s)
	{
		List<String>al=new ArrayList<String>();
	int k=4;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String t=s.substring(i, j+1);
				al.add(t);
			}
		}
		Collections.sort(al);
		System.out.println(al);
		if(k<=al.size())
		{
		String q=al.get(al.size()-1-k);
		System.out.println(q);
		}
	}
	public static void main(String[] args) {
		
		String s="abc";
		isKthLargest(s);
		
	}

}
