package collectionPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortMapByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String,Integer> map = new HashMap<>();
      map.put("suresh", 5);
      map.put("ramesh", 3);
      map.put("rajesh", 6);
      map.put("ramu", 2);
      
      ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
      list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
      
      // suppose if we need reverseOrder
      //Map.Entry.comparingByValue(Comparator.reverseOrder())
      
      LinkedHashMap<String,Integer> sorted = new LinkedHashMap<>();
      
      for(Map.Entry<String, Integer> entry: list)
      {
    	  sorted.put(entry.getKey(), entry.getValue());
      }
      System.out.println(sorted);
	}

}
