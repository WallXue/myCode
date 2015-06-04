package test.rp;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import test.model.Student;

@Repository
public interface xuewu extends CrudRepository<Student, Long> {
	@Query("from Student")
	public List<Student> all();
}
