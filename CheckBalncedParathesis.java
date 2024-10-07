package StringMostImp2level;

import java.util.Stack;

/*
 23. Check for Balanced Parentheses  
    Input: `"({[()]})"`  
    Output: `true`

 
 */
public class CheckBalncedParathesis {
	
	public static boolean isBalanced(String s)
	{
		Stack st=new Stack();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='['||s.charAt(i)=='('||
					s.charAt(i)=='{')
			{
				st.push(s.charAt(i));
			}
			else
			{
				if(st.isEmpty())
				{
					return false;
				}
				else {
					char top=(char)st.pop();
					if(s.charAt(i)=='}'&& top!='{' ||
					s.charAt(i)==']'&& top!='[' ||
					s.charAt(i)==')'&& top!='(')
					{
						return false;
					}
				}
			}
		}
		
		return st.isEmpty();
	}
	public static void main(String[] args) {
		
		String s="({[]}){}";
		if(isBalanced(s))
			System.out.println("Balanced");
		else
			System.out.println("not balanced");
		
	}

}
