package com.arya.simaple.programs;

public class DeadLock implements Runnable {
	
	static Thread main;
	@Override
	public void run() {
		
		try {
			main.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hi");	
		}

	public static void main(String... args) throws InterruptedException {
				
		main = Thread.currentThread();
		DeadLock d =  new DeadLock();
		Thread t = new Thread(d);
		t.start();
		t.join();
	}

}
