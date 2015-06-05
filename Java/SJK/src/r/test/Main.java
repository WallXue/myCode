package r.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import r.test2.TS2;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:SpringContext.xml");
		final TS1 ts1 = ac.getBean(TS1.class);
		final TS2 ts2 = ac.getBean(TS2.class);
		ts1.save();
		ts2.save();
	}

}
