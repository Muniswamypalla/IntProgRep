package com.arya.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Test1 {
	@SuppressWarnings("unchecked")
	public static void sortByValue(Map<String,String> unsortedMap) {
		Set<Map.Entry<String,String>> set = unsortedMap.entrySet();
		List<Map.Entry<String,String>> list = new ArrayList<Map.Entry<String,String>>(set);
		Collections.sort(list,new ValueComparator1());
		
		System.out.println("Sort by value: ");
		for (Map.Entry<String, String> entry : list) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}

	public static void sortByKey(Map<String,String> unsortedMap) {
		Set<Map.Entry<String,String>> set = unsortedMap.entrySet();
		List<Map.Entry<String,String>> list = new ArrayList<Map.Entry<String,String>>(set);
		Collections.sort(list,new KeyComparator1());
		
		System.out.println("Sort by key: ");
		for (Map.Entry<String, String> entry : list) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}

class ValueComparator1 implements Comparator<Map.Entry<String, String>> {

	public ValueComparator1() {
	}

	public int compare(Map.Entry<String, String> entry1, Map.Entry<String, String> entry2) {
		return entry1.getValue().compareTo(entry2.getValue());
	}
}

class KeyComparator1 implements Comparator<Map.Entry<String, String>> {

	public KeyComparator1() {
	}

	public int compare(Map.Entry<String, String> entry1, Map.Entry<String, String> entry2) {
		return entry1.getKey().compareTo(entry2.getKey());
	}
}

public class MapSortNormalWay {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		// *value Class should implements the Comparable interface
		// *String implements Comparable by default.
		map.put("Z", "3");
		map.put("D", "4");
		map.put("A", "1");
		map.put("B", "2");
		map.put("F", "6");
		map.put("E", "5");
		
		System.out.println("Unsorted Map: " + map);
		Test1.sortByValue(map);
		Test1.sortByKey(map);
	}
}
