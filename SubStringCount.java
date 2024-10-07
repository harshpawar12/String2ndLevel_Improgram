package StringMostImp2level;
/*
 
 13. Count Substring Occurrences  
    Input: `"aaaa", "aa"`  
    Output: `3`


 
 */
public class SubStringCount {
	
	public static void isCount(String s1[])
	{
		int max=0;
		String store="";
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1[i].length();j++)
			{
				String t=s1[i].substring(i, j);
				if(t.length()>max)
				{
					max=t.length();
					store=t;
				}
			}
			
			
		}
		System.out.println(max);
		System.out.println(store);
	}
	public static void main(String[] args) {
		
		String s1[]= {"aaaa","aa"};
		isCount(s1);
		
	}

}
