package StringMostImp2level;
/*
 9. Remove Duplicate Letters  
   Write a Java method to remove duplicate letters from a string so every letter appears once and the result is in the smallest lexicographical order.  
   Example:  
   Input: `"cbacdcbc"`  
   Output: `"acdb"`

 */
public class RemoveDuplicate {
	
	
	public static void isREmo(String s)
	{
		System.out.println("removed duplicate:");
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					ch[j]='\0';
				}
			}
			if(c==1 || c!=1 && ch[i]!='\0')
			{
				System.out.print(ch[i]);
			}
		}
	}
	public static void main(String[] args) {
		
		String s="cbacdcbc";
		System.out.println("original String:");
		System.out.println(s);
		System.out.println("----------------");
		isREmo(s);
		
	}

}
