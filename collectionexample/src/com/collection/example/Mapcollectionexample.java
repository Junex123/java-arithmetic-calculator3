package com.collection.example;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class Mapcollectionexample {

	public static void main(String[] args) {
		System.out.println("================");
		System.out.println("....HashMap....");
		System.out.println("================");
		
		Map<String, String> hashmap = new HashMap();
		System.out.println(hashmap.put("ID001", "rohan"));
		System.out.println(hashmap.put("ID002", "kishan"));
		System.out.println(hashmap.put("ID003", "ramesh"));
		System.out.println(hashmap.put("ID004", "anjali"));
		System.out.println(hashmap.put("ID001", "suresh"));
		System.out.println(hashmap.put("ID002", "chandan"));
		System.out.println(hashmap.put("ID003", "shukla"));
		System.out.println(hashmap.put("ID004", "powan"));
		System.out.println(hashmap.put("ID005", "null"));
		System.out.println(hashmap.put("ID006", "null"));
		System.out.println(hashmap.put("null", "roy"));
		System.out.println(hashmap.put("null", "paki"));
		
		System.out.println("Hash Map::"+ hashmap);
		
		for(Map.Entry m : hashmap.entrySet()) {
			
		}
		Map<String, String> linkedhashmap = new LinkedHashMap<>();
		Map<String, String> treemap = new TreeMap<>();
		
		
		
		
		
		
	}

}
