package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachCharacter {

	public static void main(String[] args) {

		// Without using inbuilt functions
		String s = "automation";
		char a[] = s.toCharArray();
		boolean[] visible = new boolean[a.length];
		int newSize = 0;
		for (int i = 0; i < a.length; i++) {
			if (visible[i]) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					visible[j] = true;
				}
			}
			if (count >= 0) {
				System.out.println(a[i] + " ==> " + count);
			}

		}
		
		//using built in methods
		
		String s1="automation";
		char target='o';
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c:s1.toCharArray())
		{
			if(c!=' ')
			{
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{			
				System.out.println(entry.getKey()+"=======>"+entry.getValue());
		}

	}
}
