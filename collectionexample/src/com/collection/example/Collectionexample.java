package com.collection.example;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class Collectionexample {
	public static void main(String[] args) {
		//Syntax
		//List<data type> name = new ArrayList<>();
		//List<data type> name = new LinkedList<>();
		//List<data type> name = new Vector<>();
		//List<data type> name = new Stack<>();
		
		//ArrayList - class which implements list interface.
		//it is dynamic in nature, we don't have to define the size during instantiation.
		//the ArrayList class maintain the insertion order and is non-synchronized
		//the elements stored in ArrayList can be randomly accessed
		
		List<String> friendlist = new ArrayList<String>();
		friendlist.add("sam");  //0
		friendlist.add("john");  //1
		friendlist.add("salman");  //2
		friendlist.add("maverick");  //3
		friendlist.add("tom");  //4
		friendlist.add("jimmy");  //5
		friendlist.add("ashok");  //6
		friendlist.add("khan");  //7
		friendlist.add("patrik");  //8
		friendlist.add("boston");  //9
		friendlist.add("clera");  //10
		System.out.println("My friend list is ::" + friendlist);
		System.out.println("My friends name are given below::");
		 for(String name : friendlist){
		      System.out.println(name);
		 }
		 System.out.println("My best friend is::"+friendlist.get(4));
		 List<Integer> numberlist = new ArrayList<Integer>();
		 numberlist.add(1);
		 numberlist.add(2);
		 numberlist.add(3);
		 numberlist.add(4);
		 System.out.println("My number list is::" + numberlist);
		 System.out.println("The number are as follows::");
		 for(Integer number : numberlist) {
			 System.out.println(number);
		 }
		 List<String> namelinkedlist = new LinkedList<String>();
		 namelinkedlist.add("A");
		 namelinkedlist.add("B");
		 namelinkedlist.add("C");
		 namelinkedlist.add("D");
		 namelinkedlist.add("E");
		 System.out.println("Names linked list::" +namelinkedlist);
		 numberlist.remove(0);
		 namelinkedlist.remove(0);
		 System.out.println("The number list::"+ numberlist);
		 System.out.println("the name linked list::"+ namelinkedlist);
		 if(friendlist.get(0).equals("sam")) {
			 System.out.println("Yes there is a match!!!");
		 }
		
	}

}
