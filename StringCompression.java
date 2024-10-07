package StringMostImp2level;
/*
 
  5. String Compression  
   Input: `"aaabbccc"`  
   Output: `"a3b2c3"`


 
 */
public class StringCompression {
	
	public static void isCompression(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					i++;
				}else {
					break;
				}
			}
			if(c!=1 ||c==1)
			{
				System.out.print(ch[i]+""+c);
			}
		}
	}
	public static void main(String[] args) {
		
		String s="aaabbccc";
		isCompression(s);
	}

}
