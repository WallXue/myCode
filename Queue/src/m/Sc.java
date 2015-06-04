package m;

import java.util.concurrent.BlockingQueue;

public class Sc implements Runnable {

	private BlockingQueue<Job> queue;
	
	
	public Sc(BlockingQueue<Job> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		int i = 0;
		while(true){
			if(i >2)break;
			queue.add(new Job());
			System.out.println("添加一个任务！");
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
		System.out.println("生产线程退出！");
	}
	
}
