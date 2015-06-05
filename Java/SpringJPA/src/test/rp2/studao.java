package test.rp2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.model2.stu;

@Repository
public interface studao extends CrudRepository<stu, Long> {
}
