package com.threading.example;

public class Threadingexample2 {
	public static void main(String[] args)
	{
	
	System.out.println("Here we are using thread implemented by runnable interface");
	Runnablethread runnableclass = new Runnablethread();
	Thread thread = new Thread(runnableclass);
	
	thread.start();
	

	}

}
