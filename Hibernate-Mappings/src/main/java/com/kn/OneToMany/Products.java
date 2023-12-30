package com.kn.OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Products 
{
	@Id
	int id;
	String name;
	int cost;
	@ManyToOne
	Customer customer;
	public Products(int id, String name, int cost, Customer customer) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.customer = customer;
	}
	public Products() {
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", cost=" + cost + ", customer=" + customer + "]";
	}
	
}
