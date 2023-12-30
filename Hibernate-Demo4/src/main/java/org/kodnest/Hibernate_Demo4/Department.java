package org.kodnest.Hibernate_Demo4;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department 
{
	@Id
	@Column(name="Dep_id")
	int id;
	@Column(name="Dep_name")
	String name;
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Department() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}
