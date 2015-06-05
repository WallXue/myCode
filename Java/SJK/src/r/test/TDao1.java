package r.test;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TDao1 {
	@Resource(name="sessionFactory")
	SessionFactory sf;
	
	public void save(){
		sf.getCurrentSession().save(new Stu1(1111L));
	}
}
