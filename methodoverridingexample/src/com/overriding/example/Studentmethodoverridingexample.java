package com.overriding.example;

public class Studentmethodoverridingexample extends Personmethodoverridingexample {
	public static void main(String[] args) {
		Studentmethodoverridingexample stu = new Studentmethodoverridingexample();
		stu.work();
	}
	//here we have created similar work function to person work function so we are overriding the person work function
	public void work() {
		System.out.println("the more you work toward your goal early you get the success");
	}

}
