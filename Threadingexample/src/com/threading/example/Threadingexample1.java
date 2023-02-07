package com.threading.example;

public class Threadingexample1 {
	public static void main(String[] args) {
		System.out.println("Here we are using thread by extending the thread class");
		Threadclass threadclass = new Threadclass();
		threadclass.run();
		
		System.out.println("Here we are using thread by implementing the runnable class");
		Runnablethread runnablethread = new Runnablethread();
		Thread thread = new Thread(runnablethread);
		thread.start();	
		}
	

}
