package m;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Xf implements Runnable {

private BlockingQueue<Job> queue;
	
	
	public Xf(BlockingQueue<Job> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Job job = null;
			try {
				job = queue.poll(2L, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			if(job == null)break;
			job.doSomething();
		}
		System.out.println("消费线程退出！");
	}

}
