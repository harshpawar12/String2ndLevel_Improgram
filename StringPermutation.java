package StringMostImp2level;
/*
 
  6. String Permutation  
   Input: `"abc"`  
   Output: `["abc", "acb", "bac", "bca", "cab", "cba"]`


 
 */
public class StringPermutation {
	
	public static void ispermutation(String s,String per)
	{
		
		if(s.length()==0)
		{
			System.out.println(per);
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String temp=s.substring(0, i)+s.substring(i+1);
			ispermutation(temp, per+ch);
		}
	}
	public static void main(String[] args) {
		
		String s="abc";
		
		ispermutation(s,"");
		
		
		
	}

}
