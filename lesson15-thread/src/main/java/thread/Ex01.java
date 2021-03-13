package thread;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Thread main start");
		
		// using Thread
		Thread t0 = new Thread("t0") {
			@Override
			public void run() {
				//task
				System.out.println(Thread.currentThread().getName() + "is runing..");
				
			};
		};
		t0.start();
		//using Thread, Runnable
		
		System.out.println("Thread main end");
		System.out.println("Thread main end");
	}

}
