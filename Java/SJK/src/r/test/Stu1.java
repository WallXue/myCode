package r.test;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  = "xiaowu")
public class Stu1 implements Serializable {
	@Id
	private Long id;
	@Column
	private String name;

	
	public Stu1() {
		// TODO Auto-generated constructor stub
	}

	public Stu1(long l) {
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
