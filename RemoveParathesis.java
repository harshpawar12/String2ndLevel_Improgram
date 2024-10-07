package StringMostImp2level;

import java.util.Stack;

/*
 5. Remove Invalid Parentheses  
   Write a Java method that removes the minimum number of invalid parentheses to make the input valid.  
   Example:  
   Input: `"(a)())()"`  
   Output: `"(a)()()"`

 */
public class RemoveParathesis {
	
	
	public static void isparanthesis(String s)
	{
		int max=0;
		String k="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String t=s.substring(i, j+1);
				//System.out.println(t);
				if(isRemoved(t) || t.length()>max)
				{
					max=t.length();
					System.out.println(t);
					k=t;
				}
			}
		}
		System.out.println(k);
	}
	public static boolean isRemoved(String t)
	{
		StringBuilder sb=new StringBuilder(t);
		Stack<Character>st=new Stack<Character>();
		for(int i=0;i<t.length();i++)
		{
			if(t.charAt(i)=='('||t.charAt(i)=='('||
					t.charAt(i)=='{'||t.charAt(i)=='}'||
					t.charAt(i)=='[')
			{
				st.push(t.charAt(i));
			}else {
				
				if(st.isEmpty())
				{
					sb.deleteCharAt(i);i--;
					return false;
				}else {
					char top=st.pop();
					if(t.charAt(i)==')' && top=='('||
							t.charAt(i)=='}' && top=='{'||
							t.charAt(i)==']' && top=='[')
					{
						
					}else {
						sb.deleteCharAt(i);
					}
					
				}
				
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		String s="(a)())()";
		isparanthesis(s);
		
	}

}
