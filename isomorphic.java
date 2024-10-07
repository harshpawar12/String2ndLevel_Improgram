package StringMostImp2level;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 28. Isomorphic Strings  
    Input: `"egg", "add"`  
    Output: `true`
     */
public class isomorphic {
	
	public static void isIsomorphic(String s,String s1)
	{
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					i++;
				}
				else {
					break;
				}
			}
			if(c==1 || c!=1)
			{
				sb.append(c);
				
			}
		}
		for(int i=0;i<ch1.length;i++)
		{
			int k=1;
			for(int j=i+1;j<ch1.length;j++)
			{
				if(ch1[i]==ch1[j])
				{
					k++;
					i++;
				}
				else {
					break;
				}
			}
			if(k==1 || k!=1)
			{
				sb1.append(k);
			}
		}
		String m=sb.toString();
		String D=sb1.toString();
		char ch2[]=m.toCharArray();
		Arrays.sort(ch2);
		char ch3[]=D.toCharArray();
		Arrays.sort(ch3);
		if(Arrays.equals(ch2, ch3))
		{
			System.out.println("iso");
		}
		else
		{
			System.out.println("not iso");
		}
	}
	public static void main(String[] args) {
		
		String s="add";
		String s1="dda";
		isIsomorphic(s,s1);
	}

}
