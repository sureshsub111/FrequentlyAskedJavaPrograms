package stringPrograms;

import java.util.Arrays;

public class PreserveWhiteSpacesForCharacters {

	public static void main(String[] args) {
		String s="java  is good    programming language";
		char h[]=s.toCharArray();
		
		int left=0;
		int right=h.length-1;
		
		while(left<right)
		{
			if(h[left]==' ')
			{
				left++;
			}
			else if(h[right]==' ')
			{
				right--;
			}
			else
			{
				char temp = h[left];
				h[left]=h[right];
				h[right]=temp;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(h));
		String r= "";
		for(char c:h)
		{
			r=r+c;
		}
		System.out.println(r);


	}

}
