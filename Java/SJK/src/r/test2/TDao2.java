package r.test2;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TDao2 {
	@Resource(name="sessionFactory2")
	SessionFactory sf;
	
	public void save(){
		sf.getCurrentSession().save(new Stu2(1111L));
	}
}
