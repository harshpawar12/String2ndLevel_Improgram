package StringMostImp2level;

import java.util.Stack;

import codenerapractice.returnsecondmost;

/*
     Write a Java method to check if a string 
     containing only parentheses (`'('`, `')'`, `
     '{'`, `'}'`, `'['`, `']'`) is valid.
      The string is valid if the parentheses 
      are properly closed and nested.


 */
public class checkValidParathesis {
	
	
	public static boolean isvalid(String s)
	{
		Stack<Character>st=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
			{
				st.push(s.charAt(i));
			}else {
				if(st.isEmpty())
				{
					return false;
				}else {
					char top=st.pop();
					if(s.charAt(i)==')'&& top!='('||
							s.charAt(i)=='}'&& top!='{'||
							s.charAt(i)==']'&& top!='[')
					{
						return false;
					}
				}
			}
		}
		return st.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String s="{[()]}";
		System.out.println(s);
		
		if(isvalid(s))
		{
			System.out.println("valid paranthesis");
		}else {
			System.out.println("not valid");
		}
		
		
	}

}
