package StringMostImp2level;

import java.nio.file.spi.FileSystemProvider;
import java.security.cert.TrustAnchor;
import java.util.Arrays;

import codenerapractice.returnsecondmost;

/*
 
 26. Check Subsequence  
    Input: `"abm", "ahbgdc"`  
    Output: `true`

 */
public class CheckSubsequence {
	
	public static boolean ischeckSeq(String s,String s1)
	{
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		String temp=new String(ch);
		System.out.println(temp);
		String temp1=new String(ch1);
		System.out.println(temp1);
		if(temp1.contains(temp))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}
	public static void main(String[] args) {
		
		String s="abc";
		String s1="ahbgdc";
		
		if(ischeckSeq(s,s1))
			System.out.println("true");
		else
			System.out.println("false");
		
		
		
	}

}
