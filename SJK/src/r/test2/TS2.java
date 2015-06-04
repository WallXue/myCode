package r.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TS2 {
	@Autowired
	TDao2 t2;
	
	@Transactional()
	public void save(){
		t2.save();
	}
}
