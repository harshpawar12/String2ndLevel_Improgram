package StringMostImp2level;

import codenerapractice.returnsecondmost;

/*
 
 7. First Non-Repeated Character  
   Input: `"swiss"`  
   Output: `"w"`

  
 */
public class FirstNonRepeted {
	public static String isnonRepeat(String s)
	{
		String store="";
		int x=0;
		
		for(int i=0;i<s.length();i++)
		{
			int c=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					c++;
				}
			}
			if(c==1 && x<1)
			{
				x++;
				store+=s.charAt(i);
			}
		}
		return store;
	}
	public static void main(String[] args) {
		
		String s="swiss";
		System.out.println("First non Repeting");
		System.out.println(isnonRepeat(s));
		
		
	}

}
