package threads;

public class Threads extends Thread {
	
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello" + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	};

	public static void main(String[] args) {
		Threads myThreads = new Threads();
		myThreads.start();
	};	
	

}
