package StringMostImp2level;

import java.util.Arrays;

import codenerapractice.returnsecondmost;

/*
 
 8. Check String Isomorphism  
   Input: `"foo", "bar"`  
   Output: `false`


 */
public class isomorphic1 {
	
	public static boolean isIsomorphic(String s,String s1)
	{
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			int c=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					c++;
					i++;
				}else {
					break;
				}
			}
			if(c==1 || c!=1)
			{
				sb.append(c);
			}
		}
		for(int i=0;i<s1.length();i++)
		{
			int c1=1;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					c1++;
					i++;
				}else {
					break;
				}
			}
			if(c1==1 || c1!=1)
			{
				sb1.append(c1);
			}
		}
		String temp=sb.toString();
		String temp1=sb1.toString();
		char ch[]=temp.toCharArray();
		char ch1[]=temp1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch, ch1))
		return true;
		
		return false;
	}
	public static void main(String[] args) {
		
		String s="foo";
		String s1="bar";
		if(isIsomorphic(s,s1))
			System.out.println("isomorphic");
		else
			System.out.println("not isomorphic");
		
	}

}
