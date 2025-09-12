package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class WordOccurenceInSentence {

	public static void main(String[] args) {
		
		String s="Java is great and Java is popular";
		String h[] =s.split("\\s+");
		HashMap<String,Integer> map = new HashMap<>();
		for(String c:h)
		{
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		for(Map.Entry<String, Integer> entry :map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"===> "+entry.getValue());
			}
		}

	}

}
