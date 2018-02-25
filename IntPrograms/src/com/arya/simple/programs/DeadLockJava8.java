package com.arya.simple.programs;

public class DeadLockJava8 {

	public static void main(String[] args) {

		String r1 = "muni";
		String r2 = "swamy";

		Thread t1 = new Thread(() -> {
			synchronized (r1) {
				System.out.println("Resource r1 is locked");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}

				synchronized (r2) {
					System.out.println("Resource r2 is locked");
				}
			}

		});

		Thread t2 = new Thread(() -> {
			synchronized (r2) {
				System.out.println("Resource r2 is locked");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}

				synchronized (r1) {
					System.out.println("Resource r1 is locked");
				}
			}

		});

		t1.start();
		t2.start();

	}

}
