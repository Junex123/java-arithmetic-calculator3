package com.collection.example;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Iterator;

public class Queueexample {

	public static void main(String[] args) {
		Queue<String> stringQueue = new PriorityQueue<>();
		
		stringQueue.add("john");
		stringQueue.add("max");
		stringQueue.add("zayn");
		stringQueue.add("flower");
		
		System.out.println("before using remove" +stringQueue);
		System.out.println("Head of the queue using element" +stringQueue.element());
		System.out.println("head of the queue using peek" +stringQueue.peek());
		System.out.println("remove element uing poll" +stringQueue.poll());
		System.out.println("Queue after using poll" +stringQueue);
		System.out.println("remove element using remove" +stringQueue.remove());
		System.out.println("after removing the element with remove" +stringQueue);
		
		Iterator queueItr = stringQueue.iterator();
		System.out.println("queue element using iterator::");
		while(queueItr.hasNext()) {
			System.out.println(queueItr.next());
			
		}
		
	

	}

}
