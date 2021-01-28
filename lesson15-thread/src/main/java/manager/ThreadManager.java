package manager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public interface ThreadManager {
	Future<?> safelyScheduleTask(ExecutorService executor, Runnable runnable);
}