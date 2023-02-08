package com.collection.example;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;


public class Setcollectionexampple {

	public static void main(String[] args) {
		System.out.println("==========");
		System.out.println("...HashSet...");
		System.out.println("==========");
		Set<String> sethash = new HashSet();
		
		System.out.println(sethash.add("qwerty"));
		System.out.println(sethash.add("asdfg"));
		System.out.println(sethash.add("zxcvb"));
		System.out.println(sethash.add("yuiop"));
		System.out.println(sethash.add("hjkl"));
		System.out.println(sethash.add("null"));
		System.out.println(sethash.add("null"));
		
		System.out.println("hashset====>" +sethash);
		
		Iterator<String> setitr = sethash.iterator();
		while(setitr.hasNext()) {
			System.out.println(setitr.next());
		}
		System.out.println(sethash.remove(null));
		System.out.println("hashset after remove() null===>" +sethash);
		System.out.println(sethash.removeIf(str -> str.contains("o")));
		System.out.println("hashset after remove() ==>"+sethash);
		
		for(String s : sethash)
		{
			System.out.println(s);
		}
		System.out.println("================");
		System.out.println("--LinkedhashSet--");
		System.out.println("=================");
		
		Set<String> linkedhashset = new LinkedHashSet<>();
		
		linkedhashset.add("null");
		linkedhashset.add("cricket");
		linkedhashset.add("baseball");
		linkedhashset.add("football");
		linkedhashset.add("kabaddi");
		
		System.out.println("linkedhashlist====>" + linkedhashset);
		
		linkedhashset.remove("football");
		System.out.println("set after removing football" + linkedhashset);
		
		linkedhashset.removeAll(linkedhashset);
		linkedhashset.clear();
		
		System.out.println("the set after removal==>" + linkedhashset);
		
		System.out.println("==========");
		System.out.println("--TreeSet--");
		System.out.println("===========");
		
		Set<String> sortedtreeset = new TreeSet<>();
		
		sortedtreeset.add("john");
		sortedtreeset.add("micheal");
		sortedtreeset.add("mathew");
		sortedtreeset.add("poha");
		sortedtreeset.add("qert");
		sortedtreeset.add("helloworld");
		
		
		
		
		System.out.println(sortedtreeset);
		
		
		
		
		
		
	}

}
