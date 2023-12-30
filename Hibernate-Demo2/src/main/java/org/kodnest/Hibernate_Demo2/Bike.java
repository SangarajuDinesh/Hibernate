package org.kodnest.Hibernate_Demo2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike 
{	@Id
	int reg_num;
	String mode;
	double cost;
	public Bike() {
		super();
	}
	public Bike(int reg_num, String mode, double cost) {
		super();
		this.reg_num = reg_num;
		this.mode = mode;
		this.cost = cost;
	}
	public int getReg_num() {
		return reg_num;
	}
	public void setReg_num(int reg_num) {
		this.reg_num = reg_num;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [reg_num=" + reg_num + ", mode=" + mode + ", cost=" + cost + "]";
	}
	
}
