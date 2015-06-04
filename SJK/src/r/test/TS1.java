package r.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TS1 {
	@Autowired
	TDao1 t1;
	@Transactional()
	public void save(){
		t1.save();
	}
}
