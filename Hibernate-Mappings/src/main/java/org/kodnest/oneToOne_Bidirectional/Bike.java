package org.kodnest.oneToOne_Bidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bike 
{
	@Id
	int reg_num;
	String model;
	int cost;
	@OneToOne
	Student student;
	public Bike(int reg_num, String model, int cost, Student student) {
		super();
		this.reg_num = reg_num;
		this.model = model;
		this.cost = cost;
		this.student = student;
	}
	public Bike() {
		super();
	}
	public int getReg_num() {
		return reg_num;
	}
	public void setReg_num(int reg_num) {
		this.reg_num = reg_num;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Bike [reg_num=" + reg_num + ", model=" + model + ", cost=" + cost + ", student=" + student + "]";
	}
	
	
}
