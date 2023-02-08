package com.string.example;

public class Stringexample {

	public static void main(String[] args) {
		String s ="John";
		System.out.println("String==>" +s);
		String s1 = new String("John");
		System.out.println("String1==>" +s1);
		System.out.println("comparing using double equals::" +(s == s1));
		System.out.println("comparing using .equals function::" + (s.equals(s1)));
		String a = "max";
		a= a.concat("potter");
		System.out.println("a=======>" +a);
		String b ="potter";
		String c ="potter";
		System.out.println("comparing two string using double equals" +(b == c));
		System.out.println("comparing the string using equal function" + (b.equals(c)));
		
		
		
		
	}

}
