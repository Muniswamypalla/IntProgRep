package com.arya.advance.programs;

import java.util.Vector;

class Producer1 implements Runnable {

	private final Vector<Object> queue;

	private final int SIZE;

	public Producer1(Vector<Object> queue, int SIZE) {
		super();
		this.queue = queue;
		this.SIZE = SIZE;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			try {

				// wait if queue is full
				
					synchronized (queue) {
						while (queue.size() == SIZE) {
						System.out.println("Queue is full....");
						queue.wait();
					}

				}

				synchronized (queue) {
					System.out.println("Produced " + i);

					queue.add(i);
					queue.notifyAll();

				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

class Consumer1 implements Runnable {

	private final Vector<Object> queue;
	
	private final int SIZE;

	public Consumer1(Vector<Object> queue, int SIZE) {
		super();
		this.queue = queue;
		this.SIZE = SIZE;
	}

	@Override
	public void run() {

		while (true) {
			try {
				
				while(queue.isEmpty())
				{
					synchronized (queue) {
						
						System.out.println("Queue is empty...");
						queue.wait();
						
					}
				}
				
				synchronized (queue) {
					
					System.out.println("Consumed "+queue.get(0));
					queue.remove(0);
					queue.notifyAll();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ProducerConsumerWithVector {

	public static void main(String[] args) {
		
		Vector<Object> queue = new Vector<Object>();
		
		Thread producer = new Thread(new Producer1(queue,5));
		Thread consumer = new Thread(new Consumer1(queue,5));
		
		producer.start();
		consumer.start();

	}
}
