package StringMostImp2level;
/*
 9. Remove Duplicates  
   Input: `"aabbcc"`  
   Output: `"abc"`


 
 
 */
public class RemoveDupli {
	
	public static void main(String[] args) {
		
		String s="aabbcc";
		String temp="";
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
			if(c==1 || ch[i]!='\0')
			{
				temp+=ch[i];
			}
		}
		
		System.out.println(temp);
		
	}

}
