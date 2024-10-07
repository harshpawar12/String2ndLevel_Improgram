package StringMostImp2level;
/*
 14. Longest Duplicate Substring  
    Input: `"banana"`  
    Output: `"ana"`


 */
public class longestDuplicateSubString {
	
	public static void islongestDupli(String s)
	{
		int max=0;
		String tempdata=null;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				for(int k=j;k<s.length();k++) 
				{
					for(int h=k;h<s.length();h++) 
					{
						if(s.substring(i, j+1).equals(s.substring(k, h+1)) 
								&& s.substring(i, j+1).length()>max) 
						{
                               max=s.substring(i, j+1).length();
                               tempdata=s.substring(i, j+1);
						}
					}
				}
			}
		}
		System.out.println(tempdata);
	}
	public static void main(String[] args) {
		
		String s="banana";
		islongestDupli(s);
	}

}
