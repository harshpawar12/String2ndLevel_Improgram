package StringMostImp2level;

import java.lang.reflect.Array;
import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

/*
 13. Isomorphic Strings  
    Write a Java method to check if two strings are isomorphic. Two strings are isomorphic if the characters in one string can be replaced to get the other string.  
    Example: `"egg"` and `"add"` are isomorphic, but `"foo"` and `"bar"` are not.


 */
public class isomorphic2 {
	
	public static void isIso(String s,String s1)
	{
		StringBuilder sb=new StringBuilder();
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
		
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<s1.length();i++)
		{
			int k=1;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					k++;
					i++;
				}else {
					break;
				}
			}
			if(k==1 || k!=1)
			{
				sb1.append(k);
			}
		}
		
		String t=sb.toString();
		String t1=sb1.toString();
		char ch[]=t.toCharArray();
		char ch1[]=t1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		System.out.println("---------------");
		if(Arrays.equals(ch, ch1))
		{
			System.out.println("isomorphic");
		}else {
			System.out.println("not isomorphic");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("String 1st:");
		String s="egg";
		System.out.println(s);

		System.out.println("String 2nd:");

		String s1="oof";
		System.out.println(s1);

		isIso(s,s1);
		
	}

}
