package StringMostImp2level;
/*
 14. Longest Duplicate Substring  
    Input: `"bananaa"`  
    Output: `"ana"`

 */
public class longestDuplicateSubString1 {
	
	
	public static void isLongestDupli(String s)
	{
		int max=0;
		String store=null;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
			    for(int k=j+1;k<s.length();k++) {
			    	if(s.subSequence(i, j+1).equals(s.subSequence(j, k+1)) && s.subSequence(i, j+1).length()>max ) {
			    		max=s.subSequence(i, j+1).length();
			    		store=(String) s.subSequence(i, j+1);
			    	}
				}
			}
		}
		System.out.println(store);
	}
	public static void main(String[] args) {
		
		String s="banana";
		isLongestDupli(s);
	}

}
