package stringPrograms;

import java.util.Arrays;

public class PreserveWhiteSpaceswithWords {

	public static void main(String[] args) {
		String s="java  is good    programming language";
		String h[]= s.split("(?<= )|(?= )");
		System.out.println(Arrays.toString(h));
		
		int left=0;
		int right=h.length-1;
		
		while(left<right)
		{
			if(h[left].trim().isEmpty())
			{
				left++;
			}
			else if(h[right].trim().isEmpty())
			{
				right--;
			}
			else
			{
				String temp = h[left];
				h[left]=h[right];
				h[right]=temp;
				left++;
				right--;
			}
		}
		System.out.println(String.join("", h));


	}

}
