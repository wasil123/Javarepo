package synchronization;

import java.util.Scanner;

class Processor extends Thread {
	
	private volatile boolean shutdown = true;
	
	public void run(){
		while(shutdown){
			System.out.println("Hello");
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown(){
		shutdown = false;
	}
}

public class sync1 {
	

	private static Scanner scanner;

	public static void main(String[] args){
		
		Processor proc1 = new Processor();
		proc1.start();
		
		scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutdown();
	}
}
