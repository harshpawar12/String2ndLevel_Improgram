package StringMostImp2level;
/*
 18. Longest Happy Prefix  
    Input: `"level"`  
    Output: `"l"`

 */
public class LongestPrefix {
	
	public static String isHappy(String s)
	{
		System.out.println("Longest Happy Prefix:");
	        for(int i=s.length()-1;i>0;i--)
	        {
	        	if(s.substring(0, i).equals(s.substring(s.length()-i)))
	        	{
	        		return s.substring(0, i);
	        	}
	        }
	        return "";
	       
	}
	public static void main(String[] args) {
		
		String s="level";
		System.out.println(isHappy(s));
	}

}
