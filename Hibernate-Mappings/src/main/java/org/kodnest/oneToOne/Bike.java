package org.kodnest.oneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike
{
	@Id
	int reg_num;
	String model;
	int price;
	public Bike(int reg_num, String model, int price) {
		super();
		this.reg_num = reg_num;
		this.model = model;
		this.price = price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [reg_num=" + reg_num + ", model=" + model + ", price=" + price + "]";
	}
	
}
