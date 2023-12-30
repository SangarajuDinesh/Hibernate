package com.kn.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technologies
{
	@Id
	int id;
	String skill;
	@ManyToMany
	List<Employee> employee;
	@Override
	public String toString() {
		return "Technologies [id=" + id + ", skill=" + skill + ", employee=" + employee + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public Technologies() {
		super();
	}
	public Technologies(int id, String skill, List<Employee> employee) {
		super();
		this.id = id;
		this.skill = skill;
		this.employee = employee;
	}
	
}
