package com.kn.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee 
{
	@Id
	int id;
	String name;
	String grade;
	@ManyToMany
	List<Technologies> technologies;
	public Employee(int id, String name, String grade, List<Technologies> technologies) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.technologies = technologies;
	}
	public Employee() {
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public List<Technologies> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<Technologies> technologies) {
		this.technologies = technologies;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
}
