package StringMostImp2level;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

/*
 27. Reverse Vowels  
    Input: `"hello"`  
    Output: `"holle"`

 */
public class ReverseOvel {
	
	public static void isRev(String s)
	{
		char ch[]=s.toCharArray();
		char ch1[]=new char[ch.length];
		int x=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||
					ch[i]=='o'||ch[i]=='i'||
					ch[i]=='u')
			{
				ch1[x++]=ch[i];
			}
		}
		x--;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||
					ch[i]=='o'||ch[i]=='i'||
					ch[i]=='u')
			{
				ch[i]=ch1[x--];
			}
		}
		System.out.println(Arrays.toString(ch));
		}
	public static void main(String[] args) {
		
		String s="hello";
		isRev(s);
	}

}
