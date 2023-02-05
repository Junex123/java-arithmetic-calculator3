package com.overloading.example;

public class Overloadingexample {
	public static void main(String[] args) {
		Overloadingexample overloadobj = new Overloadingexample();
		System.out.println(overloadobj.addition(10 , 20));
		System.out.println(overloadobj.addition(10 , 20 , 30));
		System.out.println(overloadobj.multiplication(10 , 5));
		System.out.println(overloadobj.multiplication(10.20 , 20.30));
	}
	//overload method-when the number of parameters are different
	//overload method-when the data type of parameters are different
	//non overload method-when the return types are different
	
	//Example 1-when the numbers of parameters are different
	public int addition(int a, int b) {
		System.out.println("Inside addition function with 2 parameters......");
		return a + b;
	}
	public int addition(int a, int b, int c) {
		System.out.println("Inside addition function with 2 parameters......");
		return a + b + c;
	}
	
	//Example 2-when the data types of parameter are different
	public int multiplication(int a, int b) {
		System.out.println("Inside multiplication function with 2 parameters of int type.....");
		return a * b;
	}

	public double multiplication(double a, double b) {
		System.out.println("Inside multiplication function with 2 parameters of double type.....");
		return a * b;
	}
	
	
	
}
