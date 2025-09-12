package collectionPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfSpecificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Automation";
		char target='o';
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c:s.toCharArray())
		{
			if(c!=' ')
			{
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{
			if(entry.getKey()==target)
			{
				System.out.println(entry.getKey()+"=======>"+entry.getValue());
			}
		}

	}

}
