package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import test.model.Student;
import test.model2.stu;
import test.rp.xuewu;
import test.rp2.studao;

@Service
public class g {
	
	@Autowired
	private xuewu xw;
	
	@Autowired
	private studao sd;
	
	@Transactional("t1")
	public void t1(){
		xw.save(new Student(10001L));
	}
	
	@Transactional("t2")
	public void t2(){
		sd.save(new stu(10001L));
	}
}
