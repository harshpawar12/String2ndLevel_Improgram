package StringMostImp2level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 22. Group Anagrams  
    Input: `["eat", "tea", "tan", "ate", "nat", "bat"]`  
    Output: `[["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]`
 */
public class groupAnagram {
	
	public static void isGroupAnagram(List<String> li)
	{
		
		for(int i=0;i<li.size();i++)
		{
			List<String>store=new ArrayList<String>();
			store.add(li.get(i));
			String temp=store.get(0);
			char ch[]=temp.toCharArray();
			Arrays.sort(ch);   //sorted all the String.
			String update=new String(ch);
			//System.out.println(update);
			for(int j=i+1;j<li.size();j++)
			{
				String temp1=li.get(j);
				char ch1[]=temp1.toCharArray();
				Arrays.sort(ch1);
				String update1=new String(ch1);
			//	System.out.println(update+"==="+update1);

				if(update.equals(update1))
				{
					store.add(li.get(j));
					li.remove(j);
					j--;
				}
			}
			System.out.println(store);
		}
		
	}
	public static void main(String[] args) {
		ArrayList<String> li=new ArrayList<String>(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));

		isGroupAnagram(li);
	}

}
