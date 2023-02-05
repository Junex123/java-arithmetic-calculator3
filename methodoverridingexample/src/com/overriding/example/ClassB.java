package com.overriding.example;

public class ClassB extends ClassA {
	public static void main(String[] args) {
		ClassB classbobj = new ClassB();
		classbobj.output1();
		classbobj.output2();
		}
	public void output1(){
		System.out.println("ClassB=====output1");
	}
	public static void output2(){
		System.out.println("ClkassB====output2");

    }
}
