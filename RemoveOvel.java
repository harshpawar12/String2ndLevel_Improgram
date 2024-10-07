package StringMostImp2level;
/*
 
 24. Remove Vowels  
    Input: `"beautiful"`  
    Output: `"btfl"`

 */
public class RemoveOvel {
	
	public static void isRemoved(String s)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||
				s.charAt(i)=='i'||s.charAt(i)=='o'||
				s.charAt(i)=='u')
			{
				continue;
			}
			else {
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
		
		String s="beautiful";
		isRemoved(s);
	}

}
