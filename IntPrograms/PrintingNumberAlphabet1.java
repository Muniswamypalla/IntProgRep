package com.arya.test;

public class PrintingNumberAlphabet1 {

	public static void main(String[] args) {

		Printer print = new Printer();
		Thread t1 = new Thread(new TaskNumAlfa(print, 10, false));
		Thread t2 = new Thread(new TaskNumAlfa(print, 10, true));
		t1.start();
		t2.start();

	}
}

class TaskNumAlfa implements Runnable {

	private int max;
	private Printer print;
	private boolean isNumber;

	TaskNumAlfa(Printer print, int max, boolean isNumber) {
		this.print = print;
		this.max = max;
		this.isNumber = isNumber;
	}

	@Override
	public void run() {


			if (isNumber) {
				for (int i = 1; i <= 26; i++) {
					print.printNumber(i);
				}
				
			} else {
				for (int i = 65; i <= 90; i++) {
					print.printAlfabet(i);
				}
				
			}

	}

}

class Printer {

	boolean isOdd = false;

	synchronized void printNumber(int number) {

		while (isOdd == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number    :" + number);
		isOdd = false;
		notifyAll();
	}

	synchronized void printAlfabet(int number) {
		while (isOdd == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Alfabet   :" + (char)number);
		isOdd = true;
		notifyAll();
	}

}
