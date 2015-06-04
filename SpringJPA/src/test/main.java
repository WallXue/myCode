package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:SpringContext.xml");
		g g = ac.getBean(g.class);
		g.t1();
		g.t2();
	}

}
