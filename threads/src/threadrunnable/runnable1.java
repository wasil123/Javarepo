package threadrunnable;

class runner implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello" + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}

public class runnable1 {
	
	public static void main(String[] args){
	Thread t1 = new Thread(new runner());
	Thread t2 = new Thread(new runner());
	
	t1.start();
	t2.start();
	}
}
