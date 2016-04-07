package com.arya.advance.programs;

public class PrintingNumberAlphabet {
	
	static boolean turn = false;// false is even and true is odd

	static class OddThread implements Runnable {
		Object o;

		public OddThread(Object o) {
			this.o = o;
		}

		@Override
		public void run() {
			synchronized (o) {
				for (int i = 1; i <= 26; i++) {
					try {
						while (!turn) {
							o.wait();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						System.out.println("Even :"+i);
						turn = !turn;
						o.notifyAll();
					}
				}
			}
		}
	}

	static class EvenThread implements Runnable {
		Object o;

		public EvenThread(Object o) {
			this.o = o;
		}

		@Override
		public void run() {
			synchronized (o) {
				for (int i = 65; i <= 90; i++) {
					try {
						while (turn) {
							o.wait();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						System.out.println("Odd  :"+(char)i);
						turn = !turn;
						o.notifyAll();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Object o = new Object();
		Thread tEven = new Thread(new EvenThread(o));
		Thread tOdd = new Thread(new OddThread(o));
		tEven.start();
		tOdd.start();
	}
}
