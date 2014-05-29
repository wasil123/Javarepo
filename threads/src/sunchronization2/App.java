package sunchronization2;

public class App {
	
	private int count = 0;
	
	public static void main(String[] args){
		App app = new App();
		app.doWork();
	}

	public void doWork() {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < 100000; i++) {
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < 100000; i++) {
					increment();
				}
			}

			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count is " + count);
		
		
	}

	public synchronized void increment() {
		// TODO Auto-generated method stub
		count++;
	}
}
