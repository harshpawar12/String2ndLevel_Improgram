package StringMostImp2level;
/*
 
 12. Reverse Words in String  
    Input: `"The sky is blue"`  
    Output: `"blue is sky The"`
*/
public class RevWord {
	public static void isRev(String s)
	{
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		String s="the sky is blue";
		isRev(s);
		
	}

}
