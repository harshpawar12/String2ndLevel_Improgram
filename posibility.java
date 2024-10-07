package StringMostImp2level;

import java.util.ArrayList;

public class posibility {

	public static void main(String[] args) {
		String s="(())";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String t=s.substring(i, j+1);
				if(t.length()%2==0) {
                	ArrayList<Character> li=new ArrayList<Character>();
                    for(int k=0;k<t.length()/2;k++) {
                    	li.add(t.charAt(k));
                    }
                    int x=0;
					int fcnt=0;
                    for(int k=t.length()-1;k>=t.length()/2;k--) {
                    	if(li.get(x)=='(' && t.charAt(k)==')' ||
                    	   li.get(x)=='{' && t.charAt(k)=='}' ||
                    	   li.get(x)=='[' && t.charAt(k)==']') {
    					fcnt++;
                    	}
                    	x++;
                    }
                    if((t.length()/2)==fcnt) {
                        System.out.println(t);
                    }
				}
			}
		}
	}

}
