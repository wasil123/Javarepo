package Threading8;

import java.util.Scanner;

public class Processor {
	public void produce() throws InterruptedException {
		// TODO Auto-generated method stub
		synchronized (this) {
			System.out.println("producer thread running ...");
			
			wait();
			
			System.out.println("Resumed.");
			
		}
	}
	
	public void consume() throws InterruptedException{
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(100);
		
		synchronized (this) {
			System.out.println("Waiting for return key...");
			
			scanner.nextLine();
			System.out.println("Key pressed");
			notify();
			
		}
	}
}
