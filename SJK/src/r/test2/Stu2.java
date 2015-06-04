package r.test2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  = "xiaowu")
public class Stu2 implements Serializable {
	@Id
	private Long id;
	@Column
	private String name;

	
	public Stu2() {
		// TODO Auto-generated constructor stub
	}

	public Stu2(long l) {
		this.id = l;
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
