package test.rp;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import test.model.Student;

@Repository
public class StudentService {
	
	@PersistenceContext(unitName="entityManagerFactory")
    protected EntityManager em;
	
	@Transactional("t2")
	public void getContactMaxSort() {
		em.persist(new Student(1001L));
	}
}
