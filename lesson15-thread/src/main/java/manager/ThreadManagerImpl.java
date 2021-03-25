package manager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadManagerImpl implements ThreadManager{

	@Override
	public Future<?> safelyScheduleTask(ExecutorService executor, Runnable runnable) {
		return runTask(executor, runnable);
	}

	private Future<?> runTask(ExecutorService executor, Runnable runnable) {
		
		return executor.submit(new Runnable() {
			
			@Override
			public void run() {
				//always run
				runnable.run();
			}
		});
	}
	
	

	
}