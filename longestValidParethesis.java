package StringMostImp2level;

import java.util.Stack;

/*
 2. Longest Valid Parentheses  
   Input: `"(()"`  
   Output: `2` (substring is `"()"`)


 */
public class longestValidParethesis {
	
	public static int isLongest(String s)
	{
		int max=0;
		String store="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String t=s.substring(i, j+1);
				
				if(isvalid(t) && t.length()>max)
				{
					max=t.length();
					store=t;
				}
			}
		}
		System.out.println(store);
		return max;
	}
	public static boolean isvalid(String t)
	{
		Stack<Character>st=new Stack<Character>();

		for(int k=0;k<t.length();k++)
		{
			if(t.charAt(k)=='('||t.charAt(k)=='{'||t.charAt(k)=='[')
			{
				st.push(t.charAt(k));
			}
			else {
				if(st.isEmpty())
				{
					return false;
				}
				else {
					char top=st.pop();
					if(t.charAt(k)==')'&& top!='('||t.charAt(k)=='}'&&top!='{'||t.charAt(k)==']'&&top!='[')
					{
						return false;
					}
				}
			}
			
		}	
		return st.isEmpty();
	}
	public static void main(String[] args) {
		
		String s="(({{}))";
		System.out.println(isLongest(s));
		
	}

}
