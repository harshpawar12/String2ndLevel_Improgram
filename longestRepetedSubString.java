package StringMostImp2level;

/*
 
 21. Longest Repeated Subsequence  
    Input: `"AABEBCDD"`  
    Output: `"ABD"`

 */
public class longestRepetedSubString {
	
	public static void isLongest(String s)
	{
		int max=0;
		String sto="";
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int c=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0' && c!=0)
			{
				sto+=ch[i];
			}
		}
		System.out.println(sto);
	}
	public static void main(String[] args) {
		
		String s="AABEBCDD";
		isLongest(s);
		
	}

}
