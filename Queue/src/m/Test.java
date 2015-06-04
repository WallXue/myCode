package m;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {

	public static void main(String[] args) {
		BlockingQueue<Job> queue = new ArrayBlockingQueue<Job>(10);
		new Thread(new Xf(queue)).start();
		new Thread(new Xf(queue)).start();
		new Thread(new Sc(queue)).start();
	}

}
