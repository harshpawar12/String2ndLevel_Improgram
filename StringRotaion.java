package StringMostImp2level;

import java.util.Arrays;

/*
 
 10. Check for Rotation  
    Input: `"waterbottle", "erbottlewat"`  
    Output: `true`

  
 */
public class StringRotaion {
	public static boolean isRotaion(String s,String s1)
	{
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch, ch1))
			return true;
		
		return false;
	}
	public static void main(String[] args) {
		
		String s="waterbottle";
		String s1="erbottlewat";
		if(isRotaion(s,s1))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
